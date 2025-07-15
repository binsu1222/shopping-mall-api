package com.example.demo.product;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

//    @GetMapping("/connectdb")
//    public void makeConnection() {
//        productService.makeConnection();
//    }

    @GetMapping("/products/{id}") //개별상품조회
    public Product findProduct(@PathVariable("id") int id) {
        return productService.findProduct(id);
    }

    @GetMapping("/products") // 전체상품조회
    public List<Product> findProducts() {
        return productService.findProducts(); // JSON array 형태로 나왔음
    }

    @PostMapping("/products")
    public void saveProduct(@RequestBody Product product) {
        productService.saveProduct(product);
    }

    @GetMapping("/test")
    public String test() {
        return "Test";
    }
}
