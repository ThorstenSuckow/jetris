package game;


import gfx.Canvas;
import gfx.CanvasController;

public class Main
{

    public static void main(String[] args) throws InterruptedException {

        Canvas canvas = new Canvas();
        Window f = new Window(canvas);
        CanvasController canvasController = new CanvasController(canvas);
        canvasController.init();


    }
}