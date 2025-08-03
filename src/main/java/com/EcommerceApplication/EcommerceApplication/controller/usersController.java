package com.EcommerceApplication.EcommerceApplication.controller;


import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import com.EcommerceApplication.EcommerceApplication.service.usersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class usersController {

    private final usersService usersService;
    //Controller will call interface service--> will call service implementation --> Implementation will call repository
    //We should always create object of Service call in controller

//    @GetMapping
//    public ResponseEntity<List<usersModel>> getAllUsers()
//    {
//        return new ResponseEntity<>(usersService.getAllUsers(), HttpStatus.OK);
//
//        //return ResponseEntity.ok(userService.getAllUsers());
//
//    }

//    @GetMapping
//    public ResponseEntity<List<usersModel>> getAllUsersById(Long id)
//    {
//        return new ResponseEntity<>(usersService.getAllUsersById(id), HttpStatus.OK);
//
//        //return ResponseEntity.ok(userService.getAllUsers());
//    }

//    @GetMapping("/{id}")
//    public ResponseEntity<usersModel> getAllUsersById(@PathVariable Long id) {
//        return new ResponseEntity<>(usersService.getAllUserById(id),HttpStatus.OK);
//    }

    @GetMapping
    public ResponseEntity<?> getAllUsers() {
        List<usersModel> data = usersService.getAllUsers();
        return ResponseEntity.ok(data);
    }


    @GetMapping("/{id}")
    public ResponseEntity<?> getUserById(@PathVariable Long id) {
        usersModel data = usersService.getUserById(id);
        return ResponseEntity.ok(data);
    }
}
