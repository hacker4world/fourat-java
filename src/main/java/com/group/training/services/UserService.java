package com.group.training.services;

import com.group.training.dto.UserRequest;
import com.group.training.entities.User;
import com.group.training.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getAllUser(){
        return userRepository.findAll();
    }

    public String addUser(UserRequest user){
        User newUser = new User(user.getName(),user.getLast_name(),user.getEmail(),user.getPassword(),user.getWallet());
        userRepository.save(newUser);
        return "User added";
    }
    public ResponseEntity<String> loginUser(UserRequest user){
        Optional<User> userOptional = userRepository.findByEmail(user.getEmail());
        if(userOptional.isEmpty()){
            return ResponseEntity.status(404).body("User not found");
        } else {
            String pass = userOptional.get().getPassword();
            if(pass.equals(user.getPassword())){
                return ResponseEntity.status(200).body("User logged in");
            } else {
                return ResponseEntity.status(401).body("Wrong password");
            }
        }

    }
}
