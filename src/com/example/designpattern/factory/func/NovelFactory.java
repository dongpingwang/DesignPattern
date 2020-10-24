package com.example.designpattern.factory.func;

import com.example.designpattern.factory.simple.IBook;
import com.example.designpattern.factory.simple.Novel;

public class NovelFactory implements AbstractBookFactory {
    @Override
    public IBook getBook() {
        return new Novel();
    }
}