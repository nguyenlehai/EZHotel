package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationServiceImpl implements RegistrationService {
  @Autowired
  UserRepository userRepository;

  private boolean registrationValid;

  public boolean validateRegistration(String firstName, String lastName, String username, String password, String emailAddress) {

	if (userRepository.findByUsername(username) == null) {
	  registrationValid = true;
//            User user = new User(firstName,lastName,username,password);

	  User user = User.builder()
			  .firstName(firstName)
			  .lastName(lastName)
			  .username(username)
			  .password(password)
			  .build();

	  userRepository.save(user);
	} else {
	  registrationValid = false;
	}

	return registrationValid;
  }
}
