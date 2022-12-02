package org.example;

public class Main {

    // Задача 1.

    public static double getMean(int[] intArr) {
        double mean = 0;
        for(int i = 0; i < intArr.length; i++) {
            mean += intArr[i];
        }
        mean /= intArr.length;
        return mean;
    }


    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 3, 2, 4, 5, 6};

        double result = getMean(intArray);
        System.out.println(result);
    }
}