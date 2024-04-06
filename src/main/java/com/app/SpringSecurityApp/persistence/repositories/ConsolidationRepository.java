package com.app.SpringSecurityApp.persistence.repositories;

import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ConsolidationRepository extends CrudRepository<ConsolidationEntity,Long> {


}
