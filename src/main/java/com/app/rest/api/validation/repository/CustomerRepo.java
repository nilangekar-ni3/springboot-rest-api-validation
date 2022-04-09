package com.app.rest.api.validation.repository;

import com.app.rest.api.validation.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

@Service
public interface CustomerRepo extends JpaRepository<Customer, Integer> {
}
