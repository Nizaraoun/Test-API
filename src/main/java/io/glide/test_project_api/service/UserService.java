package io.glide.test_project_api.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import io.glide.test_project_api.Repository.UserRepository;
import io.glide.test_project_api.model.Users;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
   
    public String registerUser(Users user) {
    
        try {
            if (userRepository.findByEmail(user.getEmail()) != null) {
                System.err.println("Error: User with email " + user.getEmail() + " already exists.");
                return null; 
            }
            System.err.println("Registering user with email: " + user.getEmail());
userRepository.save(user);
            return  "User registered successfully";
        } catch (Exception e) {
            System.err.println("An error occurred during user registration: " + e.getMessage());
            e.printStackTrace(); 
            return null; 
        }
    }
    
        // get user by id

        public Optional<Users> getUserById(Long id) {
            return userRepository.findById(id);
        }

    
    
}