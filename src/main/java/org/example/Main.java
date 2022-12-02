package org.example;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
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
            if(intArr[i] == x) {
                System.out.print(i + " ");
            }
        }
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
        getIndexOfSpecificNumber(intArray, 2);
    }
}