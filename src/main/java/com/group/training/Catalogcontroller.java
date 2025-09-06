package com.group.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
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
    public String addProduct(@RequestBody Product product) {
        return catalogService.addProduct(product);
    }
//    @PutMapping("update-product")
//    public ArrayList<Product> updateProduct(@RequestBody ProductRequest product) {
//        return catalogService.updateProduct(product);
//    }
//    @DeleteMapping("delete-product")
//    public ArrayList<Product> deleteProduct(@RequestBody ProductRequest product) {
//        return catalogService.deleteProduct(product);
//    }
}
