package gfx.figures;

import java.awt.*;

abstract public class Tetronimo
{

    int x = 10;
    int y = 10;


    public void update(int x, int y)
    {
        this.x += x;
        this.y += y;
    }

    public void draw(Graphics2D g2)
    {
        draw(g2, x, y);
    }

    public void draw(Graphics2D g2, int x, int y)
    {
         g2.drawRect(this.x, this.y,10,10);
    }
}
