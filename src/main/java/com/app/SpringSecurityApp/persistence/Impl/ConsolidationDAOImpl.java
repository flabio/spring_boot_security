package com.app.SpringSecurityApp.persistence.Impl;

import com.app.SpringSecurityApp.Service.Impl.ConsolidationServiceImpl;
import com.app.SpringSecurityApp.persistence.Dao.IConsolidationDAO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import com.app.SpringSecurityApp.persistence.repositories.ConsolidationRepository;
import com.app.SpringSecurityApp.util.ConstantMenssages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Component
public class ConsolidationDAOImpl implements IConsolidationDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsolidationServiceImpl.class);

    private final ConsolidationRepository consolidationRepository;

    public ConsolidationDAOImpl(ConsolidationRepository consolidationRepository) {
        this.consolidationRepository = consolidationRepository;
    }

    @Transactional(readOnly = true)
    @Override
    public List<ConsolidationEntity> findAll() {
        try {
            return (List<ConsolidationEntity>) this.consolidationRepository.findAll();
        } catch (Exception e) {
            LOGGER.error("Error: {} ", ConstantMenssages.ERROR_RETRIEVING);
            throw new RuntimeException(ConstantMenssages.ERROR_RETRIEVING);
        }
    }
    @Transactional(readOnly = true)
    @Override
    public Optional<ConsolidationEntity> findConsolidationById(Long id) {
        try {
            return this.consolidationRepository.findById(id);
        } catch (Exception e) {
            LOGGER.error("Error: {} ", ConstantMenssages.NOT_FOUND_ID);
            throw new RuntimeException(ConstantMenssages.NOT_FOUND_ID);
        }
    }
    @Transactional()
    @Override
    public boolean save(ConsolidationEntity consolidationEntity) {
        try {
            ConsolidationEntity consolidation = this.consolidationRepository.save(consolidationEntity);
            return this.findConsolidationById(consolidation.getId())
                    .map(result -> {
                        return true;
                    }).isPresent();
        } catch (Exception e) {
            LOGGER.error("Error: {} ", ConstantMenssages.ERROR_SAVE);
            throw new RuntimeException(ConstantMenssages.ERROR_SAVE);
        }
    }
    @Transactional()
    @Override
    public boolean update(ConsolidationEntity consolidationEntity, Long id) {
        try {
            return this.consolidationRepository.findById(id).map(
                    result -> {
                        consolidationEntity.setId(result.getId());
                        this.consolidationRepository.save(consolidationEntity);
                        return true;
                    }
            ).isPresent();
        } catch (Exception e) {
            LOGGER.error("Error: {} ", ConstantMenssages.ERROR_SAVE);
            throw new RuntimeException(ConstantMenssages.ERROR_SAVE);
        }
    }
    @Transactional()
    @Override
    public boolean delete(Long id) {
        try {
            return this.findConsolidationById(id).map(result -> {
                this.consolidationRepository.deleteById(result.getId());
                return true;
            }).orElseThrow( ()->new RuntimeException(ConstantMenssages.NOT_FOUND_ID));
        } catch (Exception e) {
            LOGGER.error(" error: {}", ConstantMenssages.NOT_FOUND_ID);
            throw new RuntimeException(ConstantMenssages.NOT_FOUND_ID);
        }
    }
}
