package org.example;


import org.example.enums.Colors;
import org.example.enums.Weekday;
import org.example.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        // 1.
        System.out.println(Colors.BLUE);

        // 2.
        System.out.println(Weekday.isWeekDay(Weekday.WEDNESDAY)); // true
        System.out.println(Weekday.isWeekDay(Weekday.SUNDAY)); // false
        System.out.println(Weekday.isHoliday(Weekday.SATURDAY)); // true
        System.out.println(Weekday.isHoliday(Weekday.MONDAY)); // false

        // 3.
        // Абстрактные классы нужно использовать, если необходимо наследование, объявление непубличных членов.
        // А в интерфейсе все методы должны быть общедоступными. Так же если добавить новый метод в интерфейс, то
        // все классы реализующие его должны реализовывать и его, поэтому чтобы это избежать нужно использовать абстрактный класс.
        // Абстрактные классы гораздо легче обновлять. Абстрактные классы позволяют частичную реализацию.
        // Абстрактные классы используются в первую очередь для объектов, связанных друг с другом, с интерфейсами для обратного.
        // etc.
        // 4.
        Student andrew = new Student(4.0, 18);
        Student alex = new Student(2.77, 17);
        Student ann = new Student(3.8, 16);
        ArrayList<Student> students = new ArrayList<>();
        students.add(alex);
        students.add(ann);
        students.add(andrew);
        for (Student student : students) {
            System.out.println(student); // Student{grade=2.77, age=17} Student{grade=3.8, age=16} Student{grade=4.0, age=18}
        }

        // 5.
//        HashMap<String, String> phoneBook = new HashMap<>();
//        while (true) {
//            System.out.println("""
//                    Выберите нужную вам функцию:\s
//                    1. Добавить новый контакт.\s
//                    2. Посмотреть все контакты.\s
//                    3. Обновить информацию о конкретном контакте.\s
//                    4. Выполнить поиск контакта по имени. \s
//                    5. Выход.""");
//            Scanner input = new Scanner(System.in);
//            int decision = input.nextInt();
//            switch (decision) {
//                case 1 -> {
//                    System.out.println("Введите имя: ");
//                    Scanner getName = new Scanner(System.in);
//                    String name = getName.nextLine();
//                    System.out.println("Введите номер телефона: ");
//                    Scanner getNumber = new Scanner(System.in);
//                    String number = getNumber.nextLine();
//                    phoneBook.put(name, number);
//                }
//                case 2 -> System.out.println(phoneBook);
//                case 3 -> {
//                    System.out.println("Введите имя: ");
//                    Scanner getName = new Scanner(System.in);
//                    String name = getName.nextLine();
//                    System.out.println("Введите новый номер телефона: ");
//                    Scanner getNumber = new Scanner(System.in);
//                    String number = getNumber.nextLine();
//                    phoneBook.replace(name, number);
//                }
//                case 4 -> {
//                    System.out.println("Введите имя: ");
//                    Scanner getName = new Scanner(System.in);
//                    String name = getName.nextLine();
//                    for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
//                        String searchName = entry.getKey();
//                        if (Objects.equals(searchName, name)) {
//                            System.out.println(entry);
//                        } else {
//                            System.out.println("Данный человек отсутствует.");
//                        }
//                    }
//                }
//                case 5 -> {
//                    return;
//                }
//            }
//        }

        // 6.
        printColors("Green", "Blue", "Red"); // [Green, Blue, Red]

        // 7.
        ArrayList<String> firstList = new ArrayList<>();
        firstList.add("One");
        ArrayList<String> secondList = new ArrayList<>();
        secondList.add("Two");
        System.out.println(areListsEquals(firstList, secondList)); // false
        ArrayList<Integer> thirdList = new ArrayList<>();
        thirdList.add(1);
        ArrayList<Integer> fourthList = new ArrayList<>();
        fourthList.add(1);
        System.out.println(areListsEquals(thirdList, fourthList)); // true

        // 8.
        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);
        ArrayList<String> strings = new ArrayList<>();
        strings.add("One");
        strings.add("Two");
        strings.add("Three");
        replaceSecondCharacter(integers, 5);
        System.out.println(integers); // [1, 5, 3]
        replaceSecondCharacter(strings, "Five");
        System.out.println(strings); // [One, Five, Three]

        // 9.
        LinkedList linkedList = new LinkedList();
        linkedList.add(1);
        linkedList.add(2);
        System.out.println(linkedList.getFirst()); // 1
        System.out.println(linkedList.getLast()); // 2
        // 10.
        for (int i = 0; i < linkedList.size(); i++) {
            linkedList.set(i, Math.random());
        }
        System.out.println(linkedList);

        // 12.
        System.out.println(isMapEmpty(new HashMap<>())); // true
        HashMap<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);
        map1.put("C", 3);
        System.out.println(isMapEmpty(map1));  // false
        // 13.
        Map<String, Integer> hashMap = new HashMap<>();
        hashMap.put("A", 1);
        hashMap.put("B", 2);
        hashMap.put("C", 3);
        Map<String, Integer> secondMap = copyMap(hashMap);

        System.out.println(secondMap); // {A=1, B=2, C=3}

        // 14.
        // Ответ на эту задачу есть в задаче про телефонный справочник.
    }
    public static void printColors(String color1, String color2, String color3) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add(color1);
        colors.add(color2);
        colors.add(color3);
        System.out.println(colors);
    }

    public static <T> boolean areListsEquals(ArrayList<T> firstList, ArrayList<T> secondList) {
        return firstList.equals(secondList);
    }

    public static <T> void replaceSecondCharacter(ArrayList<T> arrayList, T character) {
        arrayList.set(1, character);
    }

    public static <K, V> Map<K, V> copyMap(Map<K, V> original) {
        Map<K, V> secondMap = new HashMap<>();

        for (Map.Entry<K, V> entry : original.entrySet()) {
            secondMap.put(entry.getKey(), entry.getValue());
        }

        return secondMap;
    }

    public static <K, V> boolean isMapEmpty(HashMap<K, V> map) {
        return map.isEmpty();
    }
}
