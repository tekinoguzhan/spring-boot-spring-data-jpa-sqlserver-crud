package com.otekin.dev.demo.repository;

import com.otekin.dev.demo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}