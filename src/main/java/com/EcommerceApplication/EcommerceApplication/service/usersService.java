package com.EcommerceApplication.EcommerceApplication.service;

import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface usersService {

    List<usersModel> getAllUsers();
    usersModel getUserById(Long id);
}
