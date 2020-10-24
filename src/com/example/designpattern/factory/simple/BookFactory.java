package com.example.designpattern.factory.simple;

public final class BookFactory {

    private BookFactory() {

    }
    public static IBook getBook(Class<? extends IBook> bookCls) {
        IBook book = null;
        try {
            book = bookCls.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }
}