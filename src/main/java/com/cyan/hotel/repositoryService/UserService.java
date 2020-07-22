package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;

public interface UserService {

  User findByUsername(String username);

  void save(User user);

  User findByUserId(Long Id);

  boolean validateUser(String username, String password);


}
