package org.example.HW02;

import com.google.gson.Gson;

import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;

// 3.** (Для преподавателя: если не успели выполнить задание 7, дать наводку из этого
// задания) Дана json строка (можно сохранить в файл и читать из файла)
//
//[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"},{"фамилия":"Петрова",
// "оценка":"4","предмет":"Информатика"},{"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
//
//Написать метод(ы), который распарсит json и, используя StringBuilder, создаст строки
// вида: Студент [фамилия] получил [оценка] по предмету [предмет].
//
//Пример вывода:
//Студент Иванов получил 5 по предмету Математика.
//Студент Петрова получил 4 по предмету Информатика.
//Студент Краснов получил 5 по предмету Физика.
public class hw2_Task03 {
    public static void main(String[] args) throws IOException {
        String src = "C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_HW\\src\\main\\java\\org\\example\\HW02\\file.txt";
        String ratingInfo= new String(Files.readAllBytes(Paths.get(src)));
        Gson gson = new Gson();
        rating[] ratingsInfoArray = gson.fromJson(ratingInfo, rating[].class);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ratingsInfoArray.length; i++) {
            sb.append("Студент ");
            sb.append(ratingsInfoArray[i].фамилия);
            sb.append(" получил ");
            sb.append(ratingsInfoArray[i].оценка);
            sb.append(" по предмету ");
            sb.append(ratingsInfoArray[i].предмет);
            sb.append("\n");

        }
        System.out.println(sb.toString());
    }

}
