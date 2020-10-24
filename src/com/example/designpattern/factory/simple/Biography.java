package com.example.designpattern.factory.simple;

public class Biography implements IBook {
    @Override
    public String content() {
        return "传记";
    }
}