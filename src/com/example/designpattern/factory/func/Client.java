package com.example.designpattern.factory.func;

public class Client {

    public static void main(String[] args) {
        System.out.println(FactoryBuilder.getBiography().content());
    }
}