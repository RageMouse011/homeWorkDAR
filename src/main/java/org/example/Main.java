package org.example;

import org.example.model.*;

public class Main {
    public static double getArea(Triangle triangle) {
        double p = (triangle.getFirstSide() + triangle.getSecondSide() + triangle.getThirdSide()) / 2;
        return Math.sqrt(p * (p - triangle.getFirstSide()) * (p - triangle.getSecondSide()) * (p - triangle.getThirdSide()));
    }

    public static double getPerimeter(Triangle triangle) {
        return triangle.getFirstSide() + triangle.getSecondSide() + triangle.getThirdSide();
    }
    public static void main(String[] args) {
        Student alice = new Student(1L, "Alice", "Smith", "Koktem");
        Student azamat = new Student(2L, "Azamat", "Talgatovuly", "Gogolya");
        Student kristina = new Student(3L, "Kristina", "Medvedeva", "Stroiteley");

        System.out.println(alice + "\n" + azamat + "\n" + kristina);

        Triangle triangle = new Triangle(3, 3, 2);

        System.out.println(getArea(triangle));
        System.out.println(getPerimeter(triangle));

        Rectangle rectangle = new Rectangle(5, 9);
        System.out.println(rectangle.returnArea());
        Rectangle rectangle2 = new Rectangle(10, 14);
        System.out.println(rectangle2.returnArea());

        Average average = new Average();
        System.out.println(average.returnAverage(3, 3, 2));

        Movie movie1 = new Movie("Focus", "RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Main hero", "20th Century Studios");

        System.out.println(movie1);
        System.out.println(movie2);
    }
}
