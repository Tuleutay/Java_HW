package org.example.HW01;


// 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
// 2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
// 3. *Напишите программу, чтобы перевернуть строку с помощью рекурсии.
// 4. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
//    используем метод StringBuilder.append().
// 5. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
// 6. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
// 7. *Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder.


import java.util.Scanner;

public class tasksForHw2 {
    public static String firstWord;
    public static String secondWord;
    public static void main(String[] args){
        isConstain();
        isReverce();

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите слово для разварота с помощью рекурсии");
        String inputWord = scn.nextLine();
        System.out.println("Слово после разварота: " + reverceWithRecursion(inputWord));

        System.out.println("Введите первое число ");
        int a = scn.nextInt();
        System.out.println("Введите число b");
        int b = scn.nextInt();
        System.out.println(concatenateStr(a,b,"+",a+b));
        System.out.println(concatenateStr(a,b,"-",a-b));
        System.out.println(concatenateStr(a,b,"*",a*b));

        System.out.println("Первый способ замены '=' на 'равно':");
        System.out.println(wordInsert(concatenateStr(a, b, "+", a+b)));
        System.out.println(wordInsert(concatenateStr(a, b, "-", a-b)));
        System.out.println(wordInsert(concatenateStr(a, b, "*", a*b)));

        System.out.println("Второй способ замены '=' на 'равно':");
        System.out.println(wordInsertSecondVariant(concatenateStr(a, b, "+", a+b)));
        System.out.println(wordInsertSecondVariant(concatenateStr(a, b, "-", a-b)));
        System.out.println(wordInsertSecondVariant(concatenateStr(a, b, "*", a*b)));

        getMethodSpeed();

    }


    public static void isConstain(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое слово");
        firstWord = scn.nextLine();
        System.out.println("Введите 2е слово");
        secondWord = scn.nextLine();

        if (firstWord.contains(secondWord)) System.out.println("Первое слово содержит символы второго слова");
        else if (secondWord.contains(firstWord)) System.out.println("Второе слово содержит символы первого слова");
        else System.out.println("Вхождение не найдено");

        }

    public static void isReverce(){
        if (firstWord.equals(new StringBuilder(secondWord).reverse().toString()))
            System.out.println("Слова являются врощением друг друга");
        else System.out.println("Слова не являются врощением друг друга\" ");
    }

    public static String reverceWithRecursion(String str){
        if (str.length()<=1){
            return str;
        }
        return reverceWithRecursion(str.substring(1)) + str.charAt(0);
    }


    public static String concatenateStr(int a, int b, String operator, int result){
        StringBuilder sb = new StringBuilder("").append(a)
                                                .append(" " + operator + " ")
                                                .append(b)
                                                .append(" = ")
                                                .append(result);
        return sb.toString();
    }

    public static String wordInsert(String str){
        StringBuilder builder = new StringBuilder(str);
        int begin = builder.indexOf("=");
        return builder.deleteCharAt(begin).insert(begin, " равно ").toString();
    }
    public static String wordInsertSecondVariant(String str) {
        StringBuilder builder = new StringBuilder(str);
        int begin = builder.indexOf("=");
        return builder.replace(begin, begin + "=".length(), "равно").toString();
    }

    public static void getMethodSpeed(){

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 100000; i++){
            sb.append("=");
        }
        long begin = System.currentTimeMillis();
        String str = sb.toString().replace("=","Равно");
        long end = System.currentTimeMillis();
        System.out.println("Время работы метода replace для String: " + (end - begin) + "м.с.");


        begin = System.currentTimeMillis();
        for (int i=0; i < 100000; i++){
            sb.replace(i, i+1, "равно");
        }
        end = System.currentTimeMillis();
        System.out.println("Время работы метода replace для String: " + (end - begin) + "м.с.");
    }

}
