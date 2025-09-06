package com.group.training;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CatalogService {

    private ProductRepository productRepository;

    @Autowired
    public CatalogService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProd() {
        return productRepository.findAll();
    }

    public String addProduct(Product product) {
        Product newProduct = new Product(product.getName(), product.getPrice(), product.getQuantity());
        productRepository.save(newProduct);
        return "Product added successfully";
    }
//
//    public ArrayList<Product> updateProduct(ProductRequest product) {
//        products.get(product.getIndex()).setName(product.getName());
//        products.get(product.getIndex()).setPrice(product.getPrice());
//        products.get(product.getIndex()).setQuantity(product.getQuantity());
//        return products;
//    }
//
//    public ArrayList<Product> deleteProduct(ProductRequest product) {
//        products.remove(product.getIndex());
//        return products;
//    }

}
