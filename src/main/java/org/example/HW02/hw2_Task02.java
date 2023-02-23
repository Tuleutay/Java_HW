package org.example.HW02;
//2.Реализуйте алгоритм сортировки пузырьком числового массива,
// результат после каждой итерации запишите в лог-файл.
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.*;


public class hw2_Task02 {

    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(hw2_Task02.class.getName());
        FileHandler fh = new FileHandler("C:\\Users\\tooly\\Desktop\\GB\\Java\\Java_HW\\src\\main\\java\\org\\example\\HW02\\log.txt");
        logger.addHandler(fh);
        SimpleFormatter sFormat = new SimpleFormatter();
        fh.setFormatter(sFormat);
        logger.setLevel(Level.INFO);

        int [] mas = {11, 3, 14, 16, 7};
        boolean isSorted = false;
        int buf;
        while(!isSorted) {
            isSorted = true;
            for (int i = 0; i < mas.length-1; i++) {
                if(mas[i] > mas[i+1]){
                    isSorted = false;
                    buf = mas[i];
                    mas[i] = mas[i+1];
                    mas[i+1] = buf;
                    logger.info(Arrays.toString(mas));
                }
            }
        }
        System.out.println(Arrays.toString(mas));
    }
}