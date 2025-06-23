package com.taylorsz.crud.user.api;

import java.util.List;

import org.springframework.stereotype.Component;

import com.taylorsz.crud.user.core.User;
import com.taylorsz.crud.user.core.UserRole;

@Component
public class UserMapper {

    public User toUser(UserDTO userDTO) {
        return User.builder().nome(userDTO.nome()).email(userDTO.email()).senha(userDTO.senha()).role(UserRole.valueOf(userDTO.role())).build(); 
    }

    public UserDTO toUserDTO(User user) {
        return new UserDTO(user.getNome(), user.getEmail(), user.getSenha(), user.getRole().name());
    }

    public List<UserDTO> toListDTO (List<User> users) {
        return users.stream().map(this::toUserDTO).toList();
    }

    public User toUser(UserPutDTO userPutDTO) {
        return User.builder()
            .id(userPutDTO.id())
            .nome(userPutDTO.nome())
            .email(userPutDTO.email())
            .senha(userPutDTO.senha())
            .role(UserRole.valueOf(userPutDTO.role())).build(); 
    }
}
