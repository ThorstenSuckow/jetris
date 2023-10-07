package gfx;

import gfx.figures.Tetronimo;

public class Machine extends Thread
{

    CanvasController ctrl;

    public Machine(CanvasController ctrl)
    {
        this.ctrl = ctrl;
    }


    public void tick() {
        Tetronimo tetronimo = ctrl.getActiveTetronimo();

        if (tetronimo != null) {
            ctrl.tetronimoDown(tetronimo);
        }

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("sleep exc");
        }

        tick();
    }


    public void run()
    {
        tick();
    }

}
