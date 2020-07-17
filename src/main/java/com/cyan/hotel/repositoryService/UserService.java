package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;

public interface UserService {

  User findByUsername(String username);

  void save(User user);

  User findByUserId(Long userId);

  boolean validateUser(String username, String password);

  void updateUserBalance(Long userId, Double currentBalance);
}
