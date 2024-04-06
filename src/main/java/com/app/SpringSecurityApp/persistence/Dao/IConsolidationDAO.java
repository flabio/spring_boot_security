package com.app.SpringSecurityApp.persistence.Dao;

import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;

import java.util.List;
import java.util.Optional;

public interface IConsolidationDAO {
    List<ConsolidationEntity> findAll();
    Optional<ConsolidationEntity> findConsolidationById(Long id);

    boolean save(ConsolidationEntity consolidationEntity);
    boolean update(ConsolidationEntity consolidationEntity, Long id);
    boolean delete(Long id);

}
