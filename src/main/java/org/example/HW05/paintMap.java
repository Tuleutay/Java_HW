package org.example.HW05;


import java.awt.*;

public class paintMap extends Container {



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        drawField(g);

        // Здесь мы будем рисовать
    }






    private void drawField(Graphics g) {
        var map = getMap.getMap();
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
        Color[] colors = new Color[]{ Color.BLACK, Color.RED, Color.GREEN, Color.white,};

        return colors[number];
    }
}
