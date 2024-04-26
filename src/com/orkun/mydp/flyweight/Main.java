package com.orkun.mydp.flyweight;

public class Main {
    public static void main(String[] args) {
        var service = new PointService(new PointIconFactory());
        for (Point point : service.getPoints()) {
            point.draw();
        }
    }
}
