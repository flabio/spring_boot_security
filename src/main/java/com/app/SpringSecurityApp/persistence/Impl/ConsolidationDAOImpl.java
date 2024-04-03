package com.app.SpringSecurityApp.persistence.Impl;

import com.app.SpringSecurityApp.persistence.Dao.IConsolidationDAO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import com.app.SpringSecurityApp.persistence.repositories.ConsolidationRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ConsolidationDAOImpl implements IConsolidationDAO {
    private final ConsolidationRepository consolidationRepository;
    public ConsolidationDAOImpl(ConsolidationRepository consolidationRepository){
        this.consolidationRepository=consolidationRepository;
    }
    @Override
    public List<ConsolidationEntity> findAll() {
        return (List<ConsolidationEntity>) this.consolidationRepository.findAll();
    }

    @Override
    public void save(ConsolidationEntity consolidationEntity) {
        this.consolidationRepository.save(consolidationEntity);
    }
}
