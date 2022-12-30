package org.example.model;

public class Rectangle {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    public double returnArea() {
        return (length + width) * 2;
    }
}
