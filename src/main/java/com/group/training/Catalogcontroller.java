package com.group.training;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.xml.catalog.Catalog;
import java.util.ArrayList;

@RestController
public class Catalogcontroller {

    private CatalogService catalogService;

    @Autowired
    public Catalogcontroller(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @GetMapping("get-all-prod")
    public ArrayList<Product> getAllProd() {
        return catalogService.getAllProd();
    }

    @PostMapping("add-product")
    public ArrayList<Product> addProduct() {
        return catalogService.addProduct();
    }
    @PutMapping("update-product")
    public ArrayList<Product> updateProduct() {
        return catalogService.updateProduct();
    }
    @DeleteMapping("delete-product")
    public ArrayList<Product> deleteProduct() {
        return catalogService.deleteProduct();
    }
}
