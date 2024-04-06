package com.app.SpringSecurityApp.persistence.Impl;

import com.app.SpringSecurityApp.persistence.Dao.IRoleDAO;
import com.app.SpringSecurityApp.persistence.entity.RoleEntity;
import com.app.SpringSecurityApp.persistence.repositories.RoleRepository;
import com.app.SpringSecurityApp.util.ConstantMenssages;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
@Component
public class RoleDAOImpl implements IRoleDAO {
    private static  final Logger LOGGER= LoggerFactory.getLogger(RoleDAOImpl.class);

    private final RoleRepository roleRepository;
    @Autowired
    public RoleDAOImpl(RoleRepository roleRepository){
        this.roleRepository=roleRepository;
    }
    @Transactional(readOnly = true)
    @Override
    public List<RoleEntity> findAll() {
        try{
            return this.roleRepository.findAll();
        }catch (Exception e){
            LOGGER.error("Error: {} ",ConstantMenssages.ERROR_RETRIEVING);
            throw  new RuntimeException(ConstantMenssages.ERROR_RETRIEVING);
        }
    }

    @Transactional(readOnly = true)
    @Override
    public Optional<RoleEntity> findById(Long id) {
        try{
            return this.roleRepository.findById(id);
        }catch (Exception e){
            LOGGER.error("Error: {} ",ConstantMenssages.NOT_FOUND_ID);
            throw  new RuntimeException(ConstantMenssages.ERROR_RETRIEVING);
        }
    }

    @Override
    public boolean save(RoleEntity roleEntity) {
        try{
            RoleEntity role = this.roleRepository.save(roleEntity);
            return this.roleRepository.findById(role.getId()).isPresent();
        }catch (Exception e){
            LOGGER.error("Error: {} ",ConstantMenssages.ERROR_SAVE);
            throw  new RuntimeException(ConstantMenssages.ERROR_SAVE);
        }
    }

    @Override
    public boolean update(RoleEntity roleEntity, Long id) {
        try{
            return this.roleRepository.findById(id).map(result->{
                roleEntity.setId(result.getId());
                this.roleRepository.save(roleEntity);
                return true;
            }).isPresent();
        }catch (Exception e){
            LOGGER.error("Error: {}",ConstantMenssages.ERROR_SAVE);
            throw new RuntimeException(ConstantMenssages.ERROR_SAVE);
        }
    }

    @Override
    public boolean delete(Long id) {
        try{
            return this.roleRepository.findById(id).map(result->{
                this.roleRepository.deleteById(id);
                return true;
            }).isPresent();
        }catch (Exception e){
            LOGGER.error("Error: {}",ConstantMenssages.ERROR_DELETE);
            throw new RuntimeException(ConstantMenssages.ERROR_DELETE);
        }
    }
}
