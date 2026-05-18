package com.AuthService.AuthServices.mapper;

import com.AuthService.AuthServices.dto.UserRequestDTO;
import com.AuthService.AuthServices.dto.UserResponseDTO;
import com.AuthService.AuthServices.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import java.util.List;

@Mapper(componentModel = "spring", uses = {RoleMapper.class})
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserResponseDTO toUserResponseDTO(User user);

    User toUser(UserRequestDTO userRequestDTO);

    List<UserResponseDTO> toUserResponseDTOList(List<User> userList);

    List<User> toUserList(List<UserRequestDTO> userRequestDTOList);
}

