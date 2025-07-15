package com.example.demo.product;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class ProductService {
    @Autowired
    private SpringDataJPAProductRepository springDataJPAProductRepository;
//    private ProductRepository productRepository;
//    @Autowired
//    ProductService(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }

//    public void makeConnection() {
//        productRepository.makeConnection();
//    }

    public Product findProduct(int id) {
        return springDataJPAProductRepository.findById(id).get();
    }

    public List<Product> findProducts() {
        return springDataJPAProductRepository.findAll();
    }

    @Transactional
    public  void saveProduct(Product product) {
        springDataJPAProductRepository.save(product);
    }

}
