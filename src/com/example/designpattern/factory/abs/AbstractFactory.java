package com.example.designpattern.factory.abs;

import com.example.designpattern.factory.simple.IBook;
public interface AbstractFactory {
    IBook getBook();

    IFan getFan();
}