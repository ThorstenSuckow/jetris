package gfx;

import gfx.figures.Tetronimo;

import java.awt.*;


public class Canvas extends java.awt.Canvas
{

    Tetronimo[] tetronimos = new Tetronimo[100];
    public Canvas()
    {
        setBackground (Color.BLACK);

    }

    public void addTetronimo(Tetronimo tetronimo)
    {
        tetronimos[0] = tetronimo;
    }

    public void paint(Graphics g)
    {
        System.out.println("paint");

        tetronimos[0].draw((Graphics2D) g);
    }

    public void tetronimoUp()
    {
        tetronimos[0].update(0, -10);
        repaint();
    }

    public void tetronimoDown()
    {
        tetronimos[0].update(0, 10);
        repaint();
    }

    public void tetronimoToRight()
    {
        tetronimos[0].update(10, 0);
        repaint();
    }

    public void tetronimoToLeft()
    {
        tetronimos[0].update(-10, 0);
        repaint();
    }

}
