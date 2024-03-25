package com.example.expense.tracker.Service;

import com.example.expense.tracker.Repository.UserRepository;
import com.example.expense.tracker.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public boolean authenticate(String username, String password) {
        // Example: Authenticate user against database or external service
        // Implementation depends on your authentication mechanism
        return false; // Placeholder implementation
    }

    public boolean usernameExists(String username) {
        return userRepository.existsByUsername(username);
    }

    public boolean emailExists(String email) {
        return userRepository.existsByEmail(email);
    }

    public void createUser(User newUser) {
        userRepository.save(newUser);
    }
}
