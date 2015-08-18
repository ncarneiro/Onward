package ncarneiro.org.onward;

import android.graphics.Bitmap;
import android.graphics.Canvas;

/**
 * Created by Nikolas on 18/08/2015.
 */
public class DrawerThread extends Thread {

    private int width;
    private int height;
    private Canvas canvas;
    private Bitmap bitmap;

    private void paintTop(){
        paintHorizon();
    }

    private void paintCenter(){
        paintFutureRightSide();
        paintFutureRoad();
        paintFutureLeftSide();
    }

    private void paintBottom(){
        paintLeftSide();
        paintRoad();
        paintRightSide();
    }

    private void paintHorizon(){}

    private void paintRoad(){}

    private void paintLeftSide(){}

    private void paintRightSide(){}

    private void paintFutureRoad(){}

    private void paintFutureLeftSide(){}

    private void paintFutureRightSide(){}

    private void paintCar(){}

    @Override
    public void run() {
        //super.run();
        Bitmap bit = Bitmap.createBitmap(width, height, null);
        canvas = new Canvas(bit);
        paintTop();
        paintCenter();
        paintBottom();
        paintCar();
        bitmap = bit.copy(bit.getConfig(), false);
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

}