package ru.netology.service;

public class CustomsService {
    static final int constantPrice= 100;
    static final int constanWeight= 100;
    static int calculateCustoms(int price, int weight){
        int calculateCustoms = price /constantPrice + weight * constanWeight;
        return calculateCustoms;
    }
}
