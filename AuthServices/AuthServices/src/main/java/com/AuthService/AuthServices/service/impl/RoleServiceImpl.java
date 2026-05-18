package com.AuthService.AuthServices.service.impl;

import com.AuthService.AuthServices.dto.RoleRequestDTO;
import com.AuthService.AuthServices.dto.RoleResponseDTO;
import com.AuthService.AuthServices.mapper.RoleMapper;
import com.AuthService.AuthServices.model.Role;
import com.AuthService.AuthServices.repository.RoleRepository;
import com.AuthService.AuthServices.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleRepository roleRepository;

    @Autowired
    private RoleMapper roleMapper;

    @Override
    public RoleResponseDTO createRole(RoleRequestDTO roleRequestDTO) {
        Role role = roleMapper.toRole(roleRequestDTO);
        Role savedRole = roleRepository.save(role);
        return roleMapper.toRoleResponseDTO(savedRole);
    }

    @Override
    public RoleResponseDTO getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.map(roleMapper::toRoleResponseDTO).orElse(null);
    }

    @Override
    public List<RoleResponseDTO> getAllRoles() {
        List<Role> roles = roleRepository.findAll();
        return roleMapper.toRoleResponseDTOList(roles);
    }

    @Override
    public RoleResponseDTO updateRole(Long id, RoleRequestDTO roleRequestDTO) {
        Optional<Role> existingRole = roleRepository.findById(id);
        if (existingRole.isPresent()) {
            Role role = existingRole.get();
            role.setName(roleRequestDTO.getName());
            Role updatedRole = roleRepository.save(role);
            return roleMapper.toRoleResponseDTO(updatedRole);
        }
        return null;
    }

    @Override
    public boolean deleteRole(Long id) {
        if (roleRepository.existsById(id)) {
            roleRepository.deleteById(id);
            return true;
        }
        return false;
    }
}

