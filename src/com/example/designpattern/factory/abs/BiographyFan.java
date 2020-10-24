package com.example.designpattern.factory.abs;

public class BiographyFan implements IFan{
    @Override
    public String like() {
        return "传记书迷";
    }
}