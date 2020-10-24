package com.example.designpattern.factory.simple;

public class Client {

    public static void main(String[] args) {
        IBook book = BookFactory.getBook(Novel.class);
        System.out.println("Book: " + book.content());
    }
}