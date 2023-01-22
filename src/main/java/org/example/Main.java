package org.example;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {

    // Метод к задаче 1.
    public static void getResult(int num1, int num2) {

        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.println("""
                Выберите нужную вам функцию: \s
                1. Сумма двух чисел.
                2. Произведение двух чисел.
                3. Разность двух чисел.
                4. Частное двух чисел.
                5. Остаток двух чисел.
                6. Выход.""");
            int decision = input.nextInt();
            switch (decision) {
                case 1 -> System.out.println(num1 + num2);
                case 2 -> System.out.println(num1 * num2);
                case 3 -> System.out.println(num1 - num2);
                case 4 -> System.out.println(num1 / num2);
                case 5 -> System.out.println(num1 % num2);
                case 6 -> {return;}
            }
        }
    }

    // Метод к задаче 2.
    public static List<Integer> getOddList(List<Integer> arr) {
        List<Integer> result = arr.stream().filter((n) -> (n % 2) == 0).toList();
        System.out.println(result);
        return result;
    }

    // Метод к задаче 3.
    public static <T> void switchValues(T value1, T value2) {
        System.out.println(value1 + ": first value, " + value2 + ": second value before switching");
        T intermideateValue = value1;
        value1 = value2;
        value2 = intermideateValue;
        System.out.println(value1 + ": first value, " + value2 + ": second value after switching");
    }

    // Метод к задаче 4.
    public static void getMaxValueFromUsersInput() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter third number: ");
        int thirdNumber = input.nextInt();

        int intermideateValue = Math.max(firstNumber, secondNumber);
        System.out.println(Math.max(intermideateValue, thirdNumber));
    }

    // Метод к задаче 5.
    public static boolean isPositive(int n) {
        return n == Math.abs(n);
    }

    // Метод к задаче 6.
    public static void changeAllASymbolsToB(String input) {
        System.out.println(input + ": input");
        String output = "";
        char arr[] = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 'a') {
                arr[i] = 'b';
                output += arr[i];
            } else {
                output += arr[i];
            }
        }
        System.out.println(output + ": output");
    }

    // Метод к задаче 7.
    public static int getSumOfArraysNumbers(int arr[]) {
        int result = 0;
        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    // Метод к задаче 8.
    public static int getSecondMaxValue(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 2];
    }

    // Метод к задаче Shuffle String.
    public static String restoreString(String s, int[] indices) {
        HashMap<Integer, Character> map = new HashMap<>();
        String result = "";
        char[] charArr = s.toCharArray();
        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], charArr[i]);
        }
        char[] chars = map.values().toString().toCharArray();
        System.out.println(chars);
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != '[' && chars[i] != ',' && chars[i] != ' ' && chars[i] != ']') {
                result += chars[i];
            }
        }
        return result;
    }
    public static void main(String[] args) {

        // Задача 1.
     //   getResult(1, 2); // В методе можно также сделать ручной ввод необходимых чисел, чтобы программа была полезнее.
        // Задача 2.
        int[] input = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};
        List<Integer> output = IntStream.of(input).boxed().collect(Collectors.toList());
        getOddList(output);
        // Задача 3.
        switchValues(1, 2);
        switchValues("Hello", "world");
        // Задача 4.
    //    getMaxValueFromUsersInput();
        // Задача 5.
        isPositive(5); // true
        isPositive(-5); // false
        // Задача 6.
        changeAllASymbolsToB("Hanna lost her banana");
        // Задача 7.
        int arr[] = {1, 2, 3, 4, 5, 6};
        getSumOfArraysNumbers(arr); // 21
        // Задача 8.
        int arr2[] = {123, 45, 6547, 3423, 131, 6575, 5867, 234};
        getSecondMaxValue(arr2); // 6547
        // Задача Shuffle String.
        String s = "codeleet";
        int indices[] = {4, 5, 6, 7, 0, 2, 1, 3};
        restoreString(s, indices); // leetcode принял мое решение. Можно написать куда чище.
    }
}
