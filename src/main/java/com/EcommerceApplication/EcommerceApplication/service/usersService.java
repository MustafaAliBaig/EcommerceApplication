package com.EcommerceApplication.EcommerceApplication.service;

import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public interface usersService {

    List<usersModel> getAllUsers();
    usersModel getUserById(Long id);
    Optional<usersModel> getUserByEmail(String email);
}
