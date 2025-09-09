package com.group.training.services;


import com.group.training.entities.Product;
import com.group.training.repositories.ProductRepository;
import com.group.training.dto.ProductRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogService {

    private final ProductRepository productRepository;

    @Autowired
    public CatalogService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProd() {
        return productRepository.findAll();
    }

    public ResponseEntity<String> addProduct(Product product) {
        Product newProduct = new Product(product.getName(), product.getPrice(), product.getQuantity());
        productRepository.save(newProduct);
        return ResponseEntity.ok("Product added successfully");
    }
    public ResponseEntity<String> updateProduct(ProductRequest product) {
        Optional<Product> productToUpdate = productRepository.findById(product.getIndex());

        if (productToUpdate.isEmpty()) {
            return ResponseEntity.status(404).body("Product not found");
        }
        else {
            productToUpdate.get().setName(product.getName());
            productToUpdate.get().setPrice(product.getPrice());
            productToUpdate.get().setQuantity(product.getQuantity());

            productRepository.save(productToUpdate.get());

            return ResponseEntity.ok("Product updated successfully");
        }

    }

    public ResponseEntity<String> deleteProduct(ProductRequest product) {
        Optional<Product> productToUpdate = productRepository.findById(product.getIndex());

        if (productToUpdate.isEmpty()) {
            return ResponseEntity.status(404).body("Product not found");
        }
        else {
            productRepository.delete(productToUpdate.get());
            return ResponseEntity.status(200).body("Product deleted successfully");
        }
    }

}
