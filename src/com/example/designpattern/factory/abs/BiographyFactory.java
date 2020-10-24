package com.example.designpattern.factory.abs;

import com.example.designpattern.factory.simple.Biography;
import com.example.designpattern.factory.simple.IBook;

public class BiographyFactory implements AbstractFactory {
    @Override
    public IBook getBook() {
        return new Biography();
    }

    @Override
    public IFan getFan() {
        return new BiographyFan();
    }
}