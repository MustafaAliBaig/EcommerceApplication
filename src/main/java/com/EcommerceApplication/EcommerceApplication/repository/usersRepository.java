package com.EcommerceApplication.EcommerceApplication.repository;

import com.EcommerceApplication.EcommerceApplication.model.usersModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface usersRepository extends JpaRepository<usersModel, Long> {
    Optional<usersModel> findByEmailIgnoreCase(String email);
    Optional<usersModel> findByUsernameIgnoreCase(String username);
    
}
