package com.group.training;


import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.ArrayList;

@Service
public class CatalogService {
    private ArrayList<Product> products = new ArrayList<>();

    public CatalogService() {
        products.add(new Product("iphpne",1899.0,99));
        products.add(new Product("samsung",1200.0,23));
        products.add(new Product("oppo",1300.0,203));
    }

    public ArrayList<Product> getAllProd() {
        return products;
    }

    public ArrayList<Product> addProduct() {
        products.add(new Product("htc",209.0,1));
        return products;
    }

    public ArrayList<Product> updateProduct() {
        products.get(1).setPrice(1550.0);
        return products;
    }

    public ArrayList<Product> deleteProduct() {
        products.remove(2);
        return products;
    }


}
