package com.orkun.mydp.strategy;

public class Main {

    public static void main(String[] args) {
        var imageStorage = new ImageStorage();
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }
}
