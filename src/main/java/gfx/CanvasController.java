package gfx;

import gfx.figures.Square;
import gfx.figures.Tetronimo;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class CanvasController implements KeyListener
{
    Canvas canvas;

    public CanvasController(Canvas canvas)
    {
        this.canvas = canvas;
    }

    Tetronimo getActiveTetronimo()
    {
        return canvas.tetronimos[0];
    }

    public void init() throws InterruptedException {
        Square square = new Square();
        canvas.addTetronimo(square);
        canvas.addKeyListener(this);

        Machine machine = new Machine(this);
        machine.start();
    }


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        Tetronimo tetronimo = getActiveTetronimo();

        if (tetronimo == null) {
            return;
        }

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            tetronimoLeft(tetronimo);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            tetronimoRight(tetronimo);
        }

        if (e.getKeyCode() == KeyEvent.VK_UP) {
            tetronimoUp(tetronimo);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            tetronimoDown(tetronimo);
        }

    }

    public void tetronimoUp(Tetronimo tetronimo)
    {
        canvas.tetronimoUp(tetronimo);
    }

    public void tetronimoDown(Tetronimo tetronimo)
    {
        canvas.tetronimoDown(tetronimo);
    }

    public void tetronimoRight(Tetronimo tetronimo)
    {
        canvas.tetronimoRight(tetronimo);
    }

    public void tetronimoLeft(Tetronimo tetronimo)
    {
        canvas.tetronimoLeft(tetronimo);
    }



    @Override
    public void keyReleased(KeyEvent e) {

    }
}
