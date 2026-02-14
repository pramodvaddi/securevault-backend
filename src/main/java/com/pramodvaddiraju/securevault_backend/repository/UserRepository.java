package com.pramodvaddiraju.securevault_backend.repository;

import com.pramodvaddiraju.securevault_backend.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    // used during login to find user by username
    Optional<User> findByUsername(String userName);


    // used during registration to check if user already exists
    boolean existsByUsername(String userName);

    // used to check if email already exists
    boolean existsByEmail(String email);


}
