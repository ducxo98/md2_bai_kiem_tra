package com.company.repository;

public interface GeneralRepository<T> {
    int sizeArrayProduct = 20;
    int size();
    T[] showAll();
    void add(int index ,T element);
    T set(int index,T element);
    T remove(int index);
    int find(String elementName);
    void sort(double index,T element );
}
