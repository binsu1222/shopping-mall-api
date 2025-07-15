package com.example.demo.product;
import java.util.Map;
import java.util.HashMap;

import jakarta.persistence.EntityManager;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.*;

//@Repository
public class ProductRepository {

//    @Autowired
//    DataSource dataSource;
    @Autowired
    EntityManager entityManager;

//    private Map<Integer, Product> db = new HashMap<>();
    private int id = 1;

//    public void makeConnection () {
//        DataSourceUtils.getConnection(dataSource);
////    }
//
//    public Product findProduct(int id) {
//
////        return entityManager.find(id);
//    }

    public List<Product> findProducts() {
        TypedQuery<Product> query = entityManager.createQuery("SELECT p FROM Product p", Product.class);
        List<Product> products = query.getResultList();
        return products;
    }

    public void save(Product product) {
        System.out.println(product.getName());
//      db.put(id++, product);
        entityManager.persist(product);
    }
}
