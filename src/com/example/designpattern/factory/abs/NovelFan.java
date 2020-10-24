package com.example.designpattern.factory.abs;

public class NovelFan implements IFan{
    @Override
    public String like() {
        return "小说书迷";
    }
}