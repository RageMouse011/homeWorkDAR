package org.example;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    // Метод к задаче 1.
    public static int getMinValue(int a, int b, int c) {
        int result = Math.min(a, b);
        return Math.min(result, c);
    }
    // Метод к задаче 2.
    public static double getAvg(int a, int b, int c) {
        return (a + b + c) / 3;
    }
    // Метод к задаче 3.
    public static int getCountOfVowel(String str) { // Используется java.util.regex package.
        Pattern vowels = Pattern.compile("(?iu)[аеёиоуыэюя]"); // таким же образом можно добавить латинские символы.

        Matcher m = vowels.matcher(str);
        int vowelsCounter = 0;
        while (m.find()) {
            vowelsCounter++;
        }
        return vowelsCounter;
    }
    // Метод к задаче 4.
    public static int getCountOfWords(String str) {
        int count = 0;
        if (str.length() != 0) {
            count++;
            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i) == ' ') {
                    count ++;
                }
            }
        }
        return count;
    }
    // Метод к задаче 5.
    public static int getCountOfSpecificNumber(Integer value, char specificValue) {
        int count = 0;
        if (value.toString().length() != 0) {
            for (int i = 0; i < value.toString().length(); i++) {
                if(value.toString().charAt(i) ==  specificValue) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count;
    }
    // Метод к задаче 6.
    public static double getSquareOfRegularPentagon(int lengthOfSide) {
        return Math.pow(lengthOfSide, 2) / 4 * Math.sqrt(25 + 10 * Math.sqrt(5));
    }
    // Метод к задаче 7.
    public static int getSumOfValuesInNumber(Integer number) {
        int sum = 0;
        while (number != 0) {
            sum += (number % 10);
            number /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        // Задача 1.
        getMinValue(1, 2, 3); // 1
        // Задача 2.
        getAvg(1, 2, 3); // 2.0
        // Задача 3.
        getCountOfVowel("Привет, Мир!"); // 3
        // Задача 4.
        getCountOfWords("Здесь четыре обычных слова."); // 4
        // Задача 5.
        getCountOfSpecificNumber(123123, '3'); // 2
        // Задача 6.
        getSquareOfRegularPentagon( 6); // 61.9371...
        // Задача 7.
        getSumOfValuesInNumber(232); // 7

    }
}
