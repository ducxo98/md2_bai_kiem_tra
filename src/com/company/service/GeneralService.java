package com.company.service;

public interface GeneralService <T> {
    T[] showAll();
    int size();
    void add(int index ,T element);
    T set(int index,T element);
    T remove(int index);
    int find(String elementName);
    void sort(double index,T element );

}
