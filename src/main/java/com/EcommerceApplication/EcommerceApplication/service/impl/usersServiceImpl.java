package com.EcommerceApplication.EcommerceApplication.service.impl;

import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import com.EcommerceApplication.EcommerceApplication.repository.usersRepository;
import com.EcommerceApplication.EcommerceApplication.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class usersServiceImpl implements usersService {

    @Autowired
    private usersRepository usersRepository;

    @Override
    public List<usersModel> getAllUsers() {
        //access specifier, return type and method name

        return usersRepository.findAll();
    }

    @Override
    public usersModel getUserById(Long id) {
        // This method is not implemented in the original code, but you can implement it as needed.
        return usersRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        // Placeholder return statement
    }

    @Override
    public Optional<usersModel> getUserByEmail(String email) {
        return usersRepository.findByEmailIgnoreCase(email);
    }

    @Override
    public Optional<usersModel> getUserByUsername(String username) {
        return usersRepository.findByUsernameIgnoreCase(username);
    }

    @Override
    public usersModel createUser(usersModel user) {
        // This method is not implemented in the original code, but you can implement it as needed
        return usersRepository.save(user);
    }

    @Override
    public usersModel updateUser(Long id, usersModel user) {
        // This method is not implemented in the original code, but you can implement it as needed
        usersModel existingUser = usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        existingUser.setUsername(user.getUsername());
        existingUser.setEmail(user.getEmail());
        existingUser.setPassword(user.getPassword());
        existingUser.setPhone(user.getPhone());
        return usersRepository.save(existingUser);
    }

    @Override
    public void deleteUser(Long id) {
        // This method is not implemented in the original code, but you can implement it as needed
        usersRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        usersRepository.deleteById(id);
    }
}