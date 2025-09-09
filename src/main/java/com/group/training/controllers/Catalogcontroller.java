package com.group.training.controllers;

import com.group.training.entities.Product;
import com.group.training.dto.ProductRequest;
import com.group.training.services.CatalogService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Catalogcontroller {

    private CatalogService catalogService;

    @Autowired
    public Catalogcontroller(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("get-all-prod")
    public List<Product> getAllProd() {
        return catalogService.getAllProd();
    }

    @PostMapping("add-product")
    public ResponseEntity<String> addProduct(@RequestBody Product product) {
        return catalogService.addProduct(product);
    }
    @PutMapping("update-product")
    public ResponseEntity<String> updateProduct(@RequestBody ProductRequest product) {
        return catalogService.updateProduct(product);
    }
    @DeleteMapping("delete-product")
    public ResponseEntity<String> deleteProduct(@RequestBody ProductRequest product) {
        return catalogService.deleteProduct(product);
    }
}
