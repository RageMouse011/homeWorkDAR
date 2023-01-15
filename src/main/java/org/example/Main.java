package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static double getSquare(double number) {
        double result = 0;
        try {
            result = Math.sqrt(number);
        } catch (ArithmeticException e) {
            e.printStackTrace();
        } return result;
    }

    public static int divide(int x, int y) {
        try {
            return x / y;
        } catch (ArithmeticException e) {
            e.printStackTrace();
        }
        return 0;
    }

    public static void getSum() {
        System.out.println("Приветствую! Программа считывает четыре числа, " +
                           "введенные вами, и выводит на экран их сумму.");
        try {
            Thread.sleep(1000);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");

            int firstNumber = scanner.nextInt();

            System.out.println("Введите второе число: ");
            int secondNumber = scanner.nextInt();

            System.out.println("Введите третье число: ");
            int thirdNumber = scanner.nextInt();

            System.out.println("Введите четвертое число: ");
            int fourthNumber = scanner.nextInt();

            System.out.println(firstNumber + secondNumber + thirdNumber + fourthNumber);
        } catch (InputMismatchException | InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        // 1.
        getSquare(12);  // 3.4641016151377544
        getSquare(144); // 12.0

        // 2.
        divide(2, 0); // exception
        divide(3, 1); // 3

        // 3.
        getSum();
    }
}