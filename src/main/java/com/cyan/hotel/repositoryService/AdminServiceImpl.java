package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.Admin;
import com.cyan.hotel.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    AdminRepository adminRepository;

    @Override
    public Boolean existByUsername(String username) {
        return adminRepository.existsByUsername(username);
    }

    @Override
    public Admin findByUsername(String username) {
        return adminRepository.findByUsername(username);
    }


}
