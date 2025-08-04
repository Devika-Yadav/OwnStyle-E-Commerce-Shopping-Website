package com.devproject.ownStyle.service;

import com.devproject.ownStyle.model.Product;
import com.devproject.ownStyle.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    @Autowired
    private ProductRepository repo;
    public List<Product> getAllProduct() {
        return repo.findAll();

    }


    public Optional<Product> getProductById(int prodId) {
        if(prodId>0){
            return repo.findById(prodId);
        }

        return Optional.empty();
    }
}
