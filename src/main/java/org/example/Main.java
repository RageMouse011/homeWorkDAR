package org.example;

import org.example.model.StarTriangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StarTriangle starTriangle = new StarTriangle(5);
        System.out.println(starTriangle);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону квадрата: ");
        Double squareSide = scanner.nextDouble();

        System.out.println(squareArea(squareSide));
        System.out.println(squarePerimeter(squareSide));
        System.out.println(squareDiagonal(squareSide));
    }

    public static double squareArea(double squareSide) {
        return squareSide * squareSide;
    }

    public static double squarePerimeter(double squareSide) {
        return squareSide * 4;
    }

    public static double squareDiagonal(double squareSide) {
        return Math.sqrt(2)  * squareSide;
    }
}
