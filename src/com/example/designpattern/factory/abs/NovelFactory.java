package com.example.designpattern.factory.abs;

import com.example.designpattern.factory.simple.IBook;
import com.example.designpattern.factory.simple.Novel;

public class NovelFactory implements AbstractFactory {
    @Override
    public IBook getBook() {
        return new Novel();
    }

    @Override
    public IFan getFan() {
        return new NovelFan();
    }
}