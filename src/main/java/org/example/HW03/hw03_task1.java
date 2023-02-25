// +Реализовать алгоритм сортировки слиянием
package org.example.HW03;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class hw03_task1 {
    public static void main(String[] args) {
    int[] a1 = new int[] {21, 23, 24, 40, 57, 76, 65, 77, 900, 2100, 2200, 2300, 2320, 2500};
    int[] a2 = new int[] {10, 11, 20, 41, 50, 65, 86, 98, 101, 190, 1100, 1200, 3000, 5000};
    int[] a3 = new int[a1.length + a2.length];

    int i=0, j=0;
    for (int k=0; k<a3.length; k++) {

        if (i > a1.length-1) {
            int a = a2[j];
            a3[k] = a;
            j++;
        }
        else if (j > a2.length-1) {
            int a = a1[i];
            a3[k] = a;
            i++;
        }
        else if (a1[i] < a2[j]) {
            int a = a1[i];
            a3[k] = a;
            i++;
        }
        else {
            int b = a2[j];
            a3[k] = b;
            j++;
        }

    StringBuilder sb = new StringBuilder();

    for (int item: a3){
        sb.append(item);
        sb.append(", ");
    }
    System.out.println(sb.toString());
    }
    }
}


