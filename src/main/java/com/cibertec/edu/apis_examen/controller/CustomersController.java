package com.cibertec.edu.apis_examen.controller;

import com.cibertec.edu.apis_examen.model.Customers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CustomersController {
    @GetMapping("/customers")
    public List<Customers> listCustomers(){
        return Arrays.asList(
                new Customers(1,"Luis","Saldaña","ls.25@gamial.com"),
                new Customers(1,"Adrian","Llontop","adrianzg12@gamial.com")
        );
    }
}
