package org.example.HW06;

public class SearchWay {
    public static int[][] SearchWays(int[][] arr) {
        StringBuilder str = new StringBuilder();
        int x = 0;
        int y = 0;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i][j] == -2) {
                    x = i;
                    y = j;
                    str.append(y + ":" + x + ",");
                }
                if (arr[i][j] > max) {
                    max = arr[i][j];
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                while (max > 0) {
                    if (x > 0 && y > 0) {
                        if (arr[x + 1][y] == max) {
                            x = x + 1;
                            str.append(y + ":" + x + ",");
                        }
                    }
                    if (x > 0 && y > 0) {
                        if (arr[x - 1][y] == max) {
                            x = x - 1;
                            str.append(y + ":" + x + ",");
                        }
                    }
                    if (x > 0 && y > 0) {
                        if (arr[x][y + 1] == max) {
                            y = y + 1;
                            str.append(y + ":" + x + ",");
                        }
                    }
                    if (x > 0 && y > 0) {
                        if (arr[x][y - 1] == max) {
                            y = y - 1;
                            str.append(y + ":" + x + ",");
                        }
                    }
                    max--;
                }

            }
        }
        String[] coords = str.deleteCharAt(str.length() - 1).toString().split(",");
        for (int i = 1; i < coords.length - 1; i++) {
                int yC = Integer.parseInt(coords[i].substring(0, coords[i].indexOf(':')));
                int xC = Integer.parseInt(coords[i].substring(coords[i].indexOf(':') + 1));
                arr[xC][yC] = 99;
        }

        return arr;
    }
}
