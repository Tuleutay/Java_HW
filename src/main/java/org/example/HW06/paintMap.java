package org.example.HW06;


import java.awt.*;
import java.util.HashMap;





public class paintMap extends Container {




    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawField(g);

        // Здесь мы будем рисовать
    }






    private void drawField(Graphics g) {
        int[][] map = program.getMap();

        for(int x=0; x<24; x++){
            for(int y=0; y<15; y++){

                int colorNumber = map[y][x];
                Color color = colorWithNumber(colorNumber);
                g.setColor(color);


                g.fill3DRect(x*40, y*40, 40, 40, true);
            }
        }
    }

    private Color colorWithNumber(int number){

        HashMap<Integer, Color> colorsHashMap = new HashMap<>();
        colorsHashMap.put(-1, Color.BLACK);
        colorsHashMap.put(0, Color.white);
        colorsHashMap.put(-2, Color.GREEN);
        colorsHashMap.put(1, Color.RED);
        colorsHashMap.put(99, Color.orange);


        return colorsHashMap.get(number);
    }
}


