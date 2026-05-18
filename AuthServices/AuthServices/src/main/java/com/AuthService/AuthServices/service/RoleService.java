package com.AuthService.AuthServices.service;

import com.AuthService.AuthServices.dto.RoleRequestDTO;
import com.AuthService.AuthServices.dto.RoleResponseDTO;
import java.util.List;

public interface RoleService {
    RoleResponseDTO createRole(RoleRequestDTO roleRequestDTO);

    RoleResponseDTO getRoleById(Long id);

    List<RoleResponseDTO> getAllRoles();

    RoleResponseDTO updateRole(Long id, RoleRequestDTO roleRequestDTO);

    boolean deleteRole(Long id);
}

