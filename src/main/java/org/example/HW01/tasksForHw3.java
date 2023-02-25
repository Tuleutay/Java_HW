package org.example.HW01;

import java.util.*;

public class tasksForHw3 {
    public static void main(String[] args) {

        // 1. Создать новый список, добавить несколько строк с названиями цветов и вывести коллекцию на экран.
        List<String> list = new ArrayList<>();
        list.add("Розы");
        list.add("Тюльпаны");
        list.add("Астры");
        list.add("Гортензии");
        list.add("Орхидея");
        System.out.println("Первоночальный список: " + list);

        // 2. Итерация всех элементов списка цветов и добавления к каждому символа '!'.
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + "!");
        }
        System.out.println("Список после добавления символа ! : "+ list);

        // 3. Вставить элемент в список в первой позиции.
        list.add(0,"Брусника");
        System.out.println("Список после добавления 0-go" + list);

        // 4. Извлечь элемент (по указанному индексу) из заданного списка.
        System.out.println("вВЕДИТЕ ИНДЕКС  по которому надо извлеч");
        Scanner scanner = new Scanner(System.in);
        int index = scanner.nextInt();
        System.out.println("По данному индексу находится: " + list.get(index));

        // 5. Обновить определенный элемент списка по заданному индексу.
        System.out.println("Введите индекс элемента, который будем менять");
        index = scanner.nextInt();
        System.out.println("Введите новые данные: ");
        scanner.nextLine();
        String newElement = scanner.nextLine();
        list.set(index, newElement);
        System.out.println(list);

        // 6. Удалить третий элемент из списка.
        System.out.println("Удалён третий элемент: " + list.remove(2));
        System.out.println(list);

        // 7. Поиска элемента в списке по строке.
        System.out.print("Введите элемент для поиска: ");
        String input = scanner.nextLine();
        System.out.println("Индекс искомого элемента: " + list.indexOf(input));

        // 8. Создать новый список и добавить в него несколько елементов первого списка.
        List<String> list2 = new ArrayList<>();

        list2.add(list.get(0));
        list2.add(list.get(2));
        list2.add(list.get(4));
        System.out.println("Новый список с элементами из первого списка: " + list2);

        // 9. Удалить из первого списка все элементы, отсутствующие во втором списке.
        list.retainAll(list2);
        System.out.println("Удалены отсутствующие элементы: " + list);

        // 10. *Сортировка списка.
        Collections.sort(list);
        System.out.println("Отсортированный список: " + list);

        // 11. *Сравнить время работы тысячи повторений пункта 3 для ArrayList и LinkedList.

        LinkedList<String> lList = new LinkedList<>();
        lList.clone();
        long begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i+=2) {
            lList.add(0, "Фиалки");
        }
        for (int i = 1; i < 100001; i+=2) {
            lList.add(0, "Мавританки");
        }
        long end = System.currentTimeMillis();
        System.out.println("Время работы для LinkedList: " + (end - begin));

        begin = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(0, "Фиалки");
        }
        for (int i = 1; i < 100001; i+=2) {
            lList.add(1, "Мавританки");
        }
        end = System.currentTimeMillis();
        System.out.println("Время работы для ArrayList: " + (end - begin));
    }
}




