package com.EcommerceApplication.EcommerceApplication.service.impl;

import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import com.EcommerceApplication.EcommerceApplication.repository.usersRepository;
import com.EcommerceApplication.EcommerceApplication.service.usersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class usersServiceImpl implements usersService {

    @Autowired
    private usersRepository usersRepository;

    @Override
    public List<usersModel> getAllUsers(){
        //access specifier, return type and method name

        return usersRepository.findAll();
    }

    @Override
    public usersModel getUserById(Long id) {
        // This method is not implemented in the original code, but you can implement it as needed.
        return usersRepository.findById(id) .orElseThrow(() -> new RuntimeException("User not found with ID: " + id));
        // Placeholder return statement
    }


}
