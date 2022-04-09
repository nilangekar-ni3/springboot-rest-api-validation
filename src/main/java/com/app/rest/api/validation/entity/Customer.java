package com.app.rest.api.validation.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@ToString
public class Customer {

    @Id
    private int custId;
    @NotNull(message = "Cust Name should not null")
    private String custName;
    @Size(max = 20, message = "cust address Max size=20")
    private String custAddress;
    @Max(75)
    @Min(20)
    private int age;
    @Email(message = "Invalid Email Address")
    private String custMail;

}
