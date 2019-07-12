package com.company.controller;

import com.company.model.Product;
import com.company.service.ProductService;

public class ProductController {
    ProductService productService = new ProductService();
    public Product[] showAll(){
        return productService.showAll();
    }
    public int size(){
        return productService.size();
    }
    public void add(int index,Product element){
        productService.add(index,element);
    }
    public Product set(int index,Product product){
        return productService.set(index,product);
    }

}
