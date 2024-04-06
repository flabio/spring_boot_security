package com.app.SpringSecurityApp.Service.Impl;

import com.app.SpringSecurityApp.Service.DAO.IConsolidationServiceDAO;

import com.app.SpringSecurityApp.dto.ConsolidationDTO;
import com.app.SpringSecurityApp.persistence.Dao.IConsolidationDAO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import com.app.SpringSecurityApp.Service.mappers.ConsolidationMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsolidationServiceImpl implements IConsolidationServiceDAO {
    private static final Logger LOGGER = LoggerFactory.getLogger(ConsolidationServiceImpl.class);
    private final IConsolidationDAO consolidationDAO;
    private final ConsolidationMapper mapper;

    @Autowired
    public ConsolidationServiceImpl(IConsolidationDAO consolidationDAO,ConsolidationMapper mapper) {
        this.consolidationDAO = consolidationDAO;
        this.mapper=mapper;
    }
    @Override
    public List<ConsolidationDTO> findAll() {
        try {
            List<ConsolidationEntity> consolidationEntities=consolidationDAO.findAll();
            return mapper.toConsolidationDTOs(consolidationEntities);
        } catch (Exception e) {
            LOGGER.error("Error: {}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
    @Override
    public ConsolidationDTO findConsolidationById(Long id) {
        try{
            ConsolidationEntity consolidationById=consolidationDAO.findConsolidationById(id).
                    orElseThrow(
                            ()->new RuntimeException("No existe el id"+id)
                    );
            return mapper.toConsolidationDTO(consolidationById);
        } catch (Exception e) {
            LOGGER.error("Error: {}", e.getMessage());
            throw new RuntimeException(e.getMessage());
        }
    }
    @Override
    public boolean save(ConsolidationDTO consolidationEntity) {
            ConsolidationEntity consolidation = mapper.toConsolidationEntity(consolidationEntity);
            return consolidationDAO.save(consolidation);

    }
    @Override
    public boolean update(ConsolidationDTO consolidationDTO, Long id){
        ConsolidationEntity consolidation=mapper.toConsolidationEntity(consolidationDTO);
        return this.consolidationDAO.update(consolidation,id);
    }

    @Override
    public boolean delete(Long id) {
        return this.consolidationDAO.delete(id);
    }
}
