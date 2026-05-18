package com.AuthService.AuthServices.mapper;

import com.AuthService.AuthServices.dto.RoleRequestDTO;
import com.AuthService.AuthServices.dto.RoleResponseDTO;
import com.AuthService.AuthServices.model.Role;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    RoleMapper INSTANCE = Mappers.getMapper(RoleMapper.class);

    RoleResponseDTO toRoleResponseDTO(Role role);

    Role toRole(RoleRequestDTO roleRequestDTO);

    List<RoleResponseDTO> toRoleResponseDTOList(List<Role> roles);

    List<Role> toRoleList(List<RoleRequestDTO> roleRequestDTOList);
}

