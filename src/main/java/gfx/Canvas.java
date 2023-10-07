package gfx;

import gfx.figures.Tetronimo;

import java.awt.*;


public class Canvas extends java.awt.Canvas {

    public Tetronimo[] tetronimos = new Tetronimo[100];
    public Canvas() {
        setBackground(Color.BLACK);

    }

    public void addTetronimo(Tetronimo tetronimo)
    {
        tetronimos[0] = tetronimo;
    }

    public void paint(Graphics g)
    {
        tetronimos[0].draw((Graphics2D) g);
    }

    public void tetronimoUp(Tetronimo tetronimo)
    {
        //tetronimo.update(0, -10);
        //repaint();
    }

    public void tetronimoDown(Tetronimo tetronimo)
    {
        tetronimo.update(0, 10);
        repaint();
    }

    public void tetronimoRight(Tetronimo tetronimo)
    {
        tetronimo.update(10, 0);
        repaint();
    }

    public void tetronimoLeft(Tetronimo tetronimo)
    {
        tetronimo.update(-10, 0);
        repaint();
    }

}
