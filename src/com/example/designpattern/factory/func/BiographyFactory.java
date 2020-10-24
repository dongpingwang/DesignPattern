package com.example.designpattern.factory.func;

import com.example.designpattern.factory.simple.Biography;
import com.example.designpattern.factory.simple.IBook;

public class BiographyFactory implements AbstractBookFactory {
    @Override
    public IBook getBook() {
        return new Biography();
    }
}