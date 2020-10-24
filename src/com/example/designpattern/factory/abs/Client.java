package com.example.designpattern.factory.abs;

public class Client {
    public static void main(String[] args) {
        BiographyFactory biographyFactory = FactoryBuilder.getBiographyFactory();
        System.out.println(biographyFactory.getBook().content() + " " + biographyFactory.getFan().like());
    }
}