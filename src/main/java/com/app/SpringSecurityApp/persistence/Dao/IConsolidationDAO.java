package com.app.SpringSecurityApp.persistence.Dao;

import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;

import java.util.List;

public interface IConsolidationDAO {
    List<ConsolidationEntity> findAll();
    void save(ConsolidationEntity consolidationEntity);
}
