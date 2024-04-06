package com.app.SpringSecurityApp.persistence.Dao;

import com.app.SpringSecurityApp.persistence.entity.RoleEntity;

import java.util.List;
import java.util.Optional;

public interface IRoleDAO {
    List<RoleEntity> findAll();
    Optional<RoleEntity> findById(Long id);
    boolean save(RoleEntity roleEntity);
    boolean update(RoleEntity roleEntity, Long id);
    boolean delete(Long id);
}
