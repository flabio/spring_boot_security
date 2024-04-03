package com.app.SpringSecurityApp.Service.Impl;

import com.app.SpringSecurityApp.Service.DAO.IConsolidationServiceDAO;
import com.app.SpringSecurityApp.persistence.Dao.IConsolidationDAO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConsolidationServiceImpl implements IConsolidationServiceDAO {
    private final IConsolidationDAO consolidationDAO;
    @Autowired
    public ConsolidationServiceImpl(IConsolidationDAO consolidationDAO){
        this.consolidationDAO=consolidationDAO;
    }
    @Override
    public List<ConsolidationEntity> findAll() {
        return consolidationDAO.findAll();
    }

    @Override
    public void save(ConsolidationEntity consolidationEntity) {
        consolidationDAO.save(consolidationEntity);
    }
}
