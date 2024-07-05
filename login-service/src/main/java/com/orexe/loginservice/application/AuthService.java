package com.orexe.loginservice.application;

import com.orexe.loginservice.domain.model.User;
import com.orexe.loginservice.domain.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AuthService {

    @Autowired
    private UserRepository userRepository;

    public User register(String username, String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        return userRepository.save(user);
    }

    /*public User login(String username, String password) {
        Optional<User> user = userRepository.findBy(username);
        if (user.isEmpty()) {
            return null;
        }
        if (user.get().getPassword().equals(password)) {
            return user.orElse(null);
        }
        return null;
    }*/
}