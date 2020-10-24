package com.example.designpattern.factory.func;

import com.example.designpattern.factory.simple.Biography;
import com.example.designpattern.factory.simple.Novel;

public final class FactoryBuilder {
    private FactoryBuilder() {

    }
    public static Novel getNovel() {
        return (Novel) new NovelFactory().getBook();
    }
    public static Biography getBiography() {
        return (Biography) new BiographyFactory().getBook();
    }
}