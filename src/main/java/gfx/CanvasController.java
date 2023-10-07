package gfx;

import gfx.figures.Square;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CanvasController implements KeyListener
{
    Canvas canvas;

    public CanvasController(Canvas canvas)
    {
        this.canvas = canvas;
    }


    public void init()
    {
        Square square = new Square();
        canvas.addTetronimo(square);
        canvas.addKeyListener(this);

    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            canvas.tetronimoToLeft();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            canvas.tetronimoToRight();
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            canvas.tetronimoUp();
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            canvas.tetronimoDown();
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
