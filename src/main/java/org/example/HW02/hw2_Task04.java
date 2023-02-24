package org.example.HW02;

import javax.print.DocFlavor;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

//4*. Реализуйте простой калькулятор, с консольным интерфейсом. К калькулятору добавить логирование.
public class hw2_Task04 {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger("mkdir");
        FileHandler fh = new FileHandler(
                "C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_HW\\src\\main\\java\\org\\example\\HW02\\task4_log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.INFO);
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
        StringBuilder sb = new StringBuilder();
        sb.append(num1);
        sb.append(" + ");
        sb.append(num2);
        sb.append(" = ");
        sb.append(result);
        sb.append("\n");
        logger.info( sb.toString());
    }


    public static int getInt() {
        System.out.println("Введите число:");
        int num = 0;
        if (scanner.hasNextInt()){
            num = scanner.nextInt();
        }
        else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            getInt();
        }

        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();//рекурсия
            operation = getOperation();
        }
        return operation;
    }

    public static int calc(int num1, int num2, char operation){
        int result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());//рекурсия
        }
        return result;
    }
}