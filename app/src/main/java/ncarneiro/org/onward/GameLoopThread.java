package ncarneiro.org.onward;

import android.content.Context;
import android.graphics.Canvas;
import android.util.Log;
import android.view.SurfaceView;
import android.view.View;
import android.widget.ImageView;

/**
 * Created by Nikolas on 18/08/2015.
 */
public class GameLoopThread extends Thread {

    private boolean running;
    private int sleepTime = 15;

    private DrawerThread drawer;
    private GameView gameview;

    public GameLoopThread(Context context) {
        running = true;
        drawer = new DrawerThread();
        gameview = new GameView(context);
    }

    private void getInput(){
        Log.println(Log.DEBUG, "GameLoopThread", "getInput() starting.");
        Log.println(Log.DEBUG, "GameLoopThread", "getInput() ending.");
    }

    private void updateLogic(){
        Log.println(Log.DEBUG, "GameLoopThread", "updateLogic() starting.");
        //TODO
        Log.println(Log.DEBUG, "GameLoopThread", "updateLogic() ending.");
    }

    private void updateGraphics(){
        Log.println(Log.DEBUG, "GameLoopThread", "updateGraphics starting.");
        gameview.paint(drawer.getBitmap());
        Log.println(Log.DEBUG, "GameLoopThread", "updateGraphics ending.");
    }

    @Override
    public void run() {
        //super.run();
        while (running) {
            getInput();
            updateLogic();
            updateGraphics();
            try {
                Thread.sleep(sleepTime);//give some time for cpu do some other stuff
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
