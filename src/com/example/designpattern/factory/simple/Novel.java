package com.example.designpattern.factory.simple;

public class Novel implements IBook {
    @Override
    public String content() {
        return "小说";
    }
}