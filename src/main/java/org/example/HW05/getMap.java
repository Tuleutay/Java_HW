package org.example.HW05;

import javax.swing.*;
import java.awt.*;

public class getMap {



    public static void main(String[] args) {

        var map = getMap();
        System.out.println(mapColor(getMap()));
        JFrame frame = new JFrame("Карта волнового Алгоритма");
        frame.setSize(1000, 650);

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        paintMap maPanel = new paintMap();
        frame.setContentPane(maPanel);
        frame.setVisible(true);
    }

    static int[][] getMap() {
        return new int[][] {
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
                { 0, 3, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 3, 3, 3, 0, 3, 3, 3, 3, 1, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 3, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 0, 3, 3, 0, 3, 3, 3, 3, 0, 3, 0, 2, 0, 3, 3, 3, 3, 0 },
                { 0, 0, 0, 3, 0, 3, 0, 3, 3, 0, 3, 3, 3, 3, 0, 3, 0, 3, 0, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 0, 3, 3, 0, 0, 0, 3, 3, 0, 3, 0, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 3, 3, 3, 0, 3, 3, 3, 3, 0, 3, 3, 3, 0, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 3, 3, 3, 3, 0, 3, 3, 3, 3, 0, 3, 3, 3, 0, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0, 0, 0, 0, 0, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 3, 3, 3, 0, 0, 0, 0, 0, 0, 0, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3, 0 },
                { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
        };
    }

    static String rawData(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                sb.append(String.format("%2d", map[row][col]));
            }
            sb.append("\n");
        }

        return sb.toString();
    }

    static String mapColor(int[][] map) {
        StringBuilder sb = new StringBuilder();

        for (int row = 0; row < map.length; row++) {
            for (int col = 0; col < map[row].length; col++) {
                switch (map[row][col]) {
                    case 3:
                        sb.append(" . ");
                        break;
                    case 0:
                        sb.append("|#|");
                        break;
                    case 2:
                        sb.append("(*)");
                        break;
                    case 1:
                        sb.append("^-^");
                        break;
                    default:
                        break;
                }
            }
            sb.append("\n");
        }
        for (int i = 0; i < 3; i++) {
            sb.append("\n");
        }
        return sb.toString();
    }

}
