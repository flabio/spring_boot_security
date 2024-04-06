package com.app.SpringSecurityApp.util.mappers;

import com.app.SpringSecurityApp.dto.ConsolidationDTO;
import com.app.SpringSecurityApp.persistence.entity.ConsolidationEntity;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.List;

@Mapper(componentModel = "spring",uses = {ConsolidationMapper.class})
public interface ConsolidationMapper {

    @Mappings({
            @Mapping(source = "id",target = "id"),
            @Mapping(source = "firstName", target = "firstName"),
            @Mapping(source = "lastName", target = "lastName"),
            @Mapping(source = "telephone",target = "telephone"),
            @Mapping(source = "address",target = "address")
    })
    ConsolidationDTO toConsolidationDTO(ConsolidationEntity consolidationEntity);
    ConsolidationEntity toConsolidationEntity(ConsolidationDTO consolidationDTO);
    List<ConsolidationDTO> toConsolidationDTOs(List<ConsolidationEntity> consolidationEntities);
}
