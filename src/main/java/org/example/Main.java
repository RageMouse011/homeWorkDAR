package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    // Метод к задаче 1.
    public static double getMean(int[] intArr) {
        double mean = 0;
        for (int j : intArr) {
            mean += j;
        }
        mean /= intArr.length;
        return mean;
    }

    // Метод к задаче 2.
    public static Set<Integer> getDuplicates(List<Integer> integerArr) {
        Set<Integer> duplicates = new HashSet<>();
        return integerArr.stream().filter(e -> !duplicates.add(e)).collect(Collectors.toSet());
        /* stream() создает поток. filter() - вовзращает поток состоящий из элементов потока подходяего данному условию.
        В данном случае берется элемент (e), и проверяется на наличие дубликатов. и далее collector() - преобразует
        поток в коллекцию.
        */
    }

    // Метод к задаче 3.
    public static boolean checkSpecificNumber(List<Integer> integerArr, int x) {
        return integerArr.contains(x);
    }

    // Метод к задаче 4.
    public static void getIndexOfSpecificNumber(int[] intArr, int x) {
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] == x) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // Метод к задаче 5.
    public static List<Integer> getArray(List<Integer> listForFifthTask, int start, int end) {
        List<Integer> result = new ArrayList<>();
        for(int i = start; i <= end; i++) {
            result.add(listForFifthTask.get(i));
        }
        return result;
    }

    // Метод к задаче 6.
    public static void getMinAndMax(List<Integer> listForFifthTask) {
        System.out.println("Min element: " + Collections.min(listForFifthTask));
        System.out.println("Max element: " + Collections.max(listForFifthTask));
    }

    // Метод к задаче 7.
    public static void getTwoMin(List<Integer> listForFifthTask) {
        System.out.println("First min element: " + Collections.min(listForFifthTask));
        listForFifthTask.remove(Collections.min(listForFifthTask));
        System.out.println("Second min element: " + Collections.min(listForFifthTask));
    }
    // Метод к задаче 8.
    public static StringBuilder getConcatenationOfCollectionNumbers(List<Integer> listForFifthTask) {
        StringBuilder result = new StringBuilder("Вывод: ");
        listForFifthTask.sort(Comparator.reverseOrder());
        for (Integer integer : listForFifthTask) {
            result.append(integer);
        }
        return result;
    }
    // Метод к задаче 9.
    public static int[][] swappedArray(int[][] arr) {
        int[][] swappedArray = new int[arr[0].length][arr.length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                swappedArray[j][i] = swappedArray[i][j];
            }
        }
        return swappedArray;
    }
    // Метод к задаче 10.
    public static int getSumOfNumbersOfTwoDimensionalArray(int[][] twoDimensionalArray) {
        int result = 0;
        for (int i = 0; i < twoDimensionalArray.length; i++) {
            for (int j = 0; j < twoDimensionalArray.length; j++) {
                result += twoDimensionalArray[i][j];
            }
        }
        return result;
    }
    // Метод к задаче 11.
    public static boolean ifTwoDimensionalArrayIsSquared(int[][] twoDimensionalArray) {
        for (int i = 0, l = twoDimensionalArray.length; i < l; i++) {
            if (twoDimensionalArray[i].length != l) {
                return false;
            }
        }
        return true;
    }
    // Метод к задаче 12.
    public static void getMultiplicationTable(int size) {
        int counter = 1;
        int multiplication = 1;
        for (int i = counter; i <= size; i++) {
            List<Integer> temp = new ArrayList<>();
            for (int j = 1; j <= size; j++) {
                temp.add(j * multiplication);

            }
            System.out.println(temp);
            counter++;
            multiplication++;

        }
    }
    // Метод к задаче 13.
    public static void getMinAndMaxValueFromTwoDimensionalArray(int[][] array) {
        int min = array[0][0];
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        System.out.println("Максимальный элемент: " + max);
        System.out.println("Минимальный элемент: " + min);
    }

    public static void main(String[] args) {
        // Массив и коллекция для решения задач. Оба имеют одинаковое содержимое.
        int[] intArray = {1, 2, 3, 3, 2, 4, 5, 6};
        List<Integer> integerArr = new ArrayList<>();
        integerArr.add(1);
        integerArr.add(2);
        integerArr.add(3);
        integerArr.add(3);
        integerArr.add(2);
        integerArr.add(4);
        integerArr.add(5);
        integerArr.add(6);

        List<Integer> listForFifthTask = new ArrayList<>();
        listForFifthTask.add(10);
        listForFifthTask.add(50);
        listForFifthTask.add(60);
        listForFifthTask.add(70);
        listForFifthTask.add(80);

        int[][] twoDimensionalArray = { {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9} };

        // Задача 1.
        double firstResult = getMean(intArray);
        System.out.println(firstResult); // 3.25
        // Задача 2.
        Set<Integer> secondResult = getDuplicates(integerArr);
        System.out.println(secondResult); // [2, 3]
        // Задача 3.
        boolean thirdResult = checkSpecificNumber(integerArr, 6);
        System.out.println(thirdResult);
        // Задача 4.
        getIndexOfSpecificNumber(intArray, 2); // вывод 1, 4 потому что в массиве 2 таких числа.
        // Задача 5.
        List<Integer> fifthResult = getArray(listForFifthTask, 1, 3); //[50, 60, 70]
        System.out.println(fifthResult);
        // Задача 6.
        getMinAndMax(listForFifthTask); // Min element: 10, Max element: 80
        // Задача 7.
        getTwoMin(listForFifthTask); // First min element: 10, Second min element: 50
        // Задача 8.
        String eightResult = String.valueOf(getConcatenationOfCollectionNumbers(listForFifthTask));
        System.out.println(eightResult); // Вывод: 80706050 В результате нету элемента 10, потому-что он был удален в методе 7.
        // Задача 9.
        swappedArray(twoDimensionalArray); // эту задачу я подсмотрел в интернете, сам не решил ;(
        // Задача 10.
        int tenthResult = getSumOfNumbersOfTwoDimensionalArray(twoDimensionalArray);
        System.out.println(tenthResult); // 45
        // Задача 11.
        ifTwoDimensionalArrayIsSquared(twoDimensionalArray); // true
        // Задача 12.
        getMultiplicationTable(5); /* [1, 2, 3, 4, 5]
                                           [2, 4, 6, 8, 10]
                                           [3, 6, 9, 12, 15]
                                           [4, 8, 12, 16, 20]
                                           [5, 10, 15, 20, 25]
                         */
        // Задача 13.
        getMinAndMaxValueFromTwoDimensionalArray(twoDimensionalArray); // Максимальный элемент: 9, Минимальный элемент: 1.

    }
}
