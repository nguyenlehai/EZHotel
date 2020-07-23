package com.cyan.hotel.repositoryService;

import com.cyan.hotel.model.User;
import com.cyan.hotel.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

  @Autowired
  private UserRepository userRepository;

  @Override
  public User findByUsername(String username) {
	return userRepository.findByUsername(username);
  }

  public boolean existByUsername(String username){
    return userRepository.existsByUsername(username);
  }

  public boolean existByEmail(String email){
    return userRepository.existsByEmail(email);
  }

  @Override
  public void save(User user) {
	userRepository.save(user);
  }

  @Override
  public User findByUserId(Long userId) {
	return userRepository.findById(userId).get();
  }

  @Override
  public boolean validateUser(String user, String password) {
	User username = userRepository.findByUsername(user);

	return (user.equals(username.getUsername()));
  }


}
