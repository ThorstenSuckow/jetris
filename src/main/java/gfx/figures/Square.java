package gfx.figures;

import gfx.Canvas;

import java.awt.*;

public class Square extends Tetronimo
{

    Graphics2D g2;


    public Square()
    {
    }



        public void draw(Graphics2D g2, int x, int y)
    {
        g2.setColor(Color.WHITE);
        g2.setStroke(new BasicStroke(1));
        g2.drawRect(x, y,10,10);

    }

}
