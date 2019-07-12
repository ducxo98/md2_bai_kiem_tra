package com.company.repository;

import com.company.model.Product;

public class ProductRepository implements GeneralRepository<Product> {
    Product[] listProduct = new Product[sizeArrayProduct];
    {
        listProduct[0] = new Product(1,"SamSung",250,"made in Han quoc");
        listProduct[1] = new Product(2,"iphone",550,"made in Trung Quoc");
        listProduct[2] = new Product(3,"oppo",150,"made in Trung Quoc");
    }


    @Override
    public int size() {
        int size = 0;
        for (int i = 0; i<sizeArrayProduct;i++){
            if (listProduct[i] != null){
                size++;
            }
        }
        return size;
    }

    @Override
    public Product[] showAll() {
        return listProduct;
    }

    @Override
    public void add(int index, Product element) {
        Product[] addListProsuct = new Product[sizeArrayProduct];
        for (int i = 0;i<index;i++){
            addListProsuct[i] = listProduct[i];
        }
        addListProsuct[index] = element;
        for (int i = index + 1;i<sizeArrayProduct;i++){
            addListProsuct[i] = listProduct[i-1];
        }
        for (int i= 0;i<sizeArrayProduct;i++){
            listProduct[i] = addListProsuct[i];
        }

    }

    @Override
    public Product set(int index, Product element) {
        listProduct[index] = element;
        return listProduct[index];
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
