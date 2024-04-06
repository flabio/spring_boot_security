package com.app.SpringSecurityApp.Service.DAO;

import com.app.SpringSecurityApp.dto.ConsolidationDTO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;

import java.util.List;

public interface IConsolidationServiceDAO {
    List<ConsolidationDTO> findAll();
    ConsolidationDTO findConsolidationById(Long id);
    boolean save(ConsolidationDTO consolidationDTO);
    boolean update(ConsolidationDTO consolidationDTO, Long id);
    boolean delete(Long id);
}
