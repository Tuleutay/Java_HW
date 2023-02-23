package org.example.HW01;
//+Написать программу вычисления n-ого треугольного числа.
import javax.lang.model.type.NullType;
import java.util.Scanner;


public class HW01 {
    private static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        int n = getNumberByUser("Введите натуральное число n: ");
        int result = getTriangularNumber(n);
        System.out.println(result);
    }

    public static int getTriangularNumber(int x){
        int t = (x*(x+1))/2;
        return t;
    }

    public static int getNumberByUser(String text){
        System.out.print(text);
        return input.nextInt();

    }
}