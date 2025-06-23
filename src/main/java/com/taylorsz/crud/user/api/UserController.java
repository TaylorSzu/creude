package com.taylorsz.crud.user.api;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.taylorsz.crud.user.core.User;
import com.taylorsz.crud.user.core.UserService;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PutMapping;


@RestController
@RequestMapping("api/users")
@RequiredArgsConstructor
public class UserController {
    
    private final UserMapper mapper;
    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody UserDTO userDTO) {
        User user = mapper.toUser(userDTO);
        UserDTO response = mapper.toUserDTO(userService.save(user));
        return ResponseEntity.status(HttpStatus.CREATED).body(response);
    }

    @GetMapping
    public ResponseEntity<List<UserDTO>> listAll() {
        List<User> users = userService.findAll();
        List<UserDTO> response = mapper.toListDTO(users);
        return ResponseEntity.ok(response);
    }
     
    @GetMapping("{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable Long id) {
        User user = userService.findById(id);
        UserDTO response = mapper.toUserDTO(user);
        return ResponseEntity.ok(response);
    }

    @PutMapping
    public ResponseEntity<Void> update(@RequestBody UserPutDTO userPutDTO) {
        User user = mapper.toUser(userPutDTO);
        userService.update(user);
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
