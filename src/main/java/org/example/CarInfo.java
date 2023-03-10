package org.example;
// сколько путей получения числа Б из А, путем прибавления на с и умножения на д


public class CarInfo {
    public static void main(String[] args) {
        int a = 2;
        int b = 11;
        int c = 1;
        int d = 2;

        int[] way = new int[b + 1];
        way[a] = 1;

        for (int i = a + 1; i <= b; i++) {
            way[i] = i % d == 0 ? way[i - c] + way[i / d] : way[i - c];

        }
        System.out.println(way[b]);
    }
}
//
//Реализация волнового алгоритма
//
//1. генератор карт
//    1.1 статическая
//    int[][] generateMap (int width, int height)
//    1.2 автогенерация карт
//    1.3 загрузка карт из файла
//
//2. Печать карты в "сыром" виде
//    2.1 терминал
//    String printMap(int [][])
//    2.2 принтер
//    2.3 сторонний серпис API
//
//3. Печать карты красиво
//
//4. Раскарска карты
//    void colorize(int[][] map)
//    4.1 установка котика
//    4.2 выходы
//
//5. Поиск выхода