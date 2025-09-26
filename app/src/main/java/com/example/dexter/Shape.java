package com.example.dexter;

public abstract class Shape {
    public int x;
    public int y;

    private String color = "YELLOW";

    public Shape(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
