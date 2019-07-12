package com.company.model;

import java.util.Scanner;

public class Product {
    int id ;
    String name;
    double price;
    String desciption;

    public Product() {
    }


    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", desciption='" + desciption + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public Product(int id, String name, double price, String desciption) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.desciption = desciption;
    }
    public void setProductInfo() {
        Scanner input = new Scanner(System.in);
        System.out.println("ID:");
        this.id = input.nextInt();
        input.nextLine();
        System.out.println("Name:");
        this.name = input.nextLine();
        System.out.println("pice:");
        this.price = input.nextInt();
        input.nextLine();
        System.out.println("Desciption:");
        this.name = input.nextLine();
    }
}
