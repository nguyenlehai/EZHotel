package com.cyan.hotel.repository;

import com.cyan.hotel.model.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Integer> {
  Admin findByUsername(String username);

  Boolean existsByUsername(String username);
}
