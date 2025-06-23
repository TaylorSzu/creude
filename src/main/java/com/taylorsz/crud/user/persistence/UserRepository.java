package com.taylorsz.crud.user.persistence;

import org.springframework.data.jpa.repository.JpaRepository;

import com.taylorsz.crud.user.core.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
