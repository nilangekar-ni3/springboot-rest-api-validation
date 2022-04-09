package com.app.rest.api.validation.controller;

import com.app.rest.api.validation.entity.Customer;
import com.app.rest.api.validation.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerResource {

    @Autowired
    CustomerRepo customerRepo;

    @PostMapping("/saveCustInfo")
    public Customer saveCustInfo(@RequestBody Customer customer) {
        return customerRepo.save(customer);
    }

    @GetMapping("/getAllCustInfo")
    public List<Customer> getCustomerList(){
        return customerRepo.findAll();
    }



}
