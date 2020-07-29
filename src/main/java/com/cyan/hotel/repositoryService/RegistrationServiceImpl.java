package com.cyan.hotel.repositoryService;

import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
    @Autowired
    UserRepository userRepository;

    private boolean registrationValid;

    public boolean validateRegistration(String firstName, String lastName, String username, String password, String emailAddress) {
        registrationValid = userRepository.findByUsername(username) == null;

        return registrationValid;
    }
}
