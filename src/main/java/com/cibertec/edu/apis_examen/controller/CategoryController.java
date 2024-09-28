package com.cibertec.edu.apis_examen.controller;

import com.cibertec.edu.apis_examen.model.Category;
import com.cibertec.edu.apis_examen.model.Customers;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CategoryController {

    @GetMapping("/category")
    public List<Category> listCustomers(){
        return Arrays.asList(
                new Category(1,"Lacteos","Todos los Lacteos"),
                new Category(1,"Bebidas","Todas las bebidas")

        );
    }

}
