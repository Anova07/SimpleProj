package com.projects.minisota.controller;

import com.projects.minisota.model.Product;
import com.projects.minisota.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;
    //@RequestMapping("/products")
    @GetMapping("/products")
    public List<Product> getProducts(){
        return service.getProducts();
    }
    @RequestMapping("/products/{prodId}")
    public Product getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);

    }

    @PostMapping("/products")
    public void addProduct(@RequestBody Product prod){
          service.addProduct(prod);

    }
    @PutMapping("/products")
    public void updateProduct(@RequestBody Product prod){
        System.out.println("calling updateProduct");
        service.updateProduct(prod);

    }

    @DeleteMapping("/product/{prodID}")
    public void deleteProduct(@PathVariable int prodID){
        System.out.println("calling updateProduct");
        service.deleteProduct(prodID);

    }
}
