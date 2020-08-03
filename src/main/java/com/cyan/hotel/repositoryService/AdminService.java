package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Admin;

public interface AdminService {
  Boolean existByUsername(String username);

  Admin findByUsername(String username);

}
