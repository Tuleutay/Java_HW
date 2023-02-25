package org.example.HW01;


// Создать множество, ключ и значение строки. Добавить шесть элементов. Вывести в консоль значения.
// Добавить ко всем значениям символ "!".
// Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключами первого.
// Объеденить значания во втором множестве и первом если ключи совпадают. Вывести результат в консоль.

import java.util.HashMap;

public class tasksForHw5 {


    public static void main(String[] args) {
        HashMap<Integer, String> hashMapCountries = new HashMap<>();
        hashMapCountries.put(0, "Казахстан");
        hashMapCountries.put(1, "Аргентина");
        hashMapCountries.put(2, "Египет");
        hashMapCountries.put(3, "США");
        hashMapCountries.put(4, "Япония");
        hashMapCountries.put(5, "Австралия");

        System.out.println("Первое множество: ");
        hashMapCountries.forEach((k,v) -> System.out.println("[" + k + ": " + v + "]"));

        System.out.println("-".repeat(10));
        HashMap<Integer,String> hashMapCapitalCitys = new HashMap<>();

        hashMapCapitalCitys.put(0, "Астана");
        hashMapCapitalCitys.put(1, "БоеносАйрос");
        hashMapCapitalCitys.put(2, "Каир");
        hashMapCapitalCitys.put(3, "Вашингтон");
        hashMapCapitalCitys.put(4, "Киото");
        hashMapCapitalCitys.put(5, "Сидней");

        System.out.println("Второе множество: ");
        hashMapCapitalCitys.forEach((k,v) -> System.out.println("[" + k + ": " + v + "]"));

        System.out.println("-".repeat(10));
        HashMap<Integer, String> overalHashMap = new HashMap<>(hashMapCountries);
        overalHashMap.putAll(hashMapCapitalCitys);
        System.out.println("Объединенное множество: ");
        for (Integer key: overalHashMap.keySet()){
            if (hashMapCountries.containsKey(key) && hashMapCapitalCitys.containsKey(key)){

                overalHashMap.compute(key, (k,v) -> v = hashMapCountries.get(key) + " - " + v);
            }
        }

        overalHashMap.forEach((k,v) -> System.out.println("[" + k + ": " + v + "]"));

    }
}
