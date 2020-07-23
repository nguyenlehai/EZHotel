package com.cyan.hotel.repository;

import com.cyan.hotel.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

// in order to execute update operation
@Transactional
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

  User findByUsername(String username);

  Boolean existsByUsername(String username);

  Boolean existsByEmail(String email);

  Optional<User> findById(Long id);

}
