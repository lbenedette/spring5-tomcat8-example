package com.auth0.samples.controller;

import com.auth0.samples.model.Product;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductController {
    private final List<Product> products = new ArrayList<>();

    public ProductController() {
        products.add(new Product("Coca-cola", BigDecimal.valueOf(2.36)));
        products.add(new Product("Bread", BigDecimal.valueOf(1.7)));
    }

    @GetMapping
    public List<Product> getProducts() {
        return products;
    }

    @PostMapping
    public void addProduct(@RequestBody Product product) {
        products.add(product);
    }

    @DeleteMapping
    public void deleteProduct(@PathVariable int index) {
        products.remove(index);
    }
}
