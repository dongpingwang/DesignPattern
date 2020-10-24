package com.example.designpattern.factory.abs;

public final class FactoryBuilder {

    private FactoryBuilder() {

    }

    public static BiographyFactory getBiographyFactory() {
        return new BiographyFactory();
    }

    public static NovelFactory getNovelFactory() {
        return new NovelFactory();
    }
}