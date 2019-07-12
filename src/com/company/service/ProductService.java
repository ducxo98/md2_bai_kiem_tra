package com.company.service;

import com.company.model.Product;
import com.company.repository.ProductRepository;

public class ProductService implements GeneralService<Product> {
    ProductRepository productRepository = new ProductRepository();

    @Override
    public Product[] showAll() {
        return productRepository.showAll();
    }

    @Override
    public int size() {
        return productRepository.size();
    }

    @Override
    public void add(int index, Product element) {
        productRepository.add(index,element);

    }

    @Override
    public Product set(int index, Product element) {

        return productRepository.set(index,element);
    }

    @Override
    public Product remove(int index) {
        return null;
    }

    @Override
    public int find(String elementName) {
        return 0;
    }

    @Override
    public void sort(double index, Product element) {

    }
}
