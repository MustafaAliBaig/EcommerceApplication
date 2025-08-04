package com.EcommerceApplication.EcommerceApplication.controller;


import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import com.EcommerceApplication.EcommerceApplication.service.usersService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/users")
@RequiredArgsConstructor
public class usersController {

    private final usersService usersService;
    //Controller will call interface service--> will call service implementation --> Implementation will call repository
    //We should always create object of Service call in controller


//    @GetMapping
//    public ResponseEntity<usersModel> getAllUsers() {
//       // List<usersModel> data = usersService.getAllUsers();
//        return usersService.getAllUsers()
//
//    }

    @GetMapping
    public List<usersModel> getAllUsers() {
        return usersService.getAllUsers();
    }


    @GetMapping("/{id}")
    public ResponseEntity<usersModel> getUserById(@PathVariable Long id) {
        usersModel data = usersService.getUserById(id);
        return ResponseEntity.ok(data);
    }

    @GetMapping("/email/{email}")
    public ResponseEntity<usersModel> getUserByEmail(@PathVariable String email) {
        return usersService.getUserByEmail(email)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/username/{username}")
    public ResponseEntity<usersModel> getUserByUsername(@PathVariable String username) {
        return usersService.getUserByUsername(username)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping("/create")
    public ResponseEntity<usersModel> createUser(@RequestBody usersModel user) {
        return ResponseEntity.ok(usersService.createUser(user));
    }

    @PutMapping("/{id}")
    public ResponseEntity<usersModel> updateUser(@PathVariable Long id, @RequestBody usersModel user) {
        usersModel updatedUser = usersService.updateUser(id, user);
        return ResponseEntity.ok(updatedUser);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUser(@PathVariable Long id) {
        usersService.deleteUser(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}