package com.company;

import com.company.controller.ProductController;
import com.company.model.Product;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int index;
        ProductController productController = new ProductController();
        Product[] listProduct = productController.showAll();
        int size = productController.size();

        for (int i= 0;i<size;i++){
            System.out.println(listProduct[i].toString());
        }
        //add product
        Product product = new Product();
        product.setProductInfo();
        productController.add(1,product);
        for (int i= 0;i<size;i++){
            System.out.println(listProduct[i].toString());
        }

        System.out.println("nhap thong tin can sua");
        product.setProductInfo();
        productController.set(2,product);
        for (int i= 0;i<size;i++){
            System.out.println(listProduct[i].toString());
        }





//        Product product = new Product();
//        Scanner input = new Scanner(System.in);
//        System.out.println("nhap vi tri them");
//        index = input.nextInt();
//        if (index < 0 && index >= size) {
//            System.out.println("Full");
//        }
//        System.out.println("Nhap thong tin sinh vien can them:");
//        product.setProductInfo();
//        productController.add(index, product);
//        size++;



    }
}
