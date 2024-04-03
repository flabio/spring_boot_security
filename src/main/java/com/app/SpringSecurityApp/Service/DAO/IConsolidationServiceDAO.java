package com.app.SpringSecurityApp.Service.DAO;

import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;

import java.util.List;

public interface IConsolidationServiceDAO {
    List<ConsolidationEntity> findAll();
    void save(ConsolidationEntity consolidationEntity);
}
