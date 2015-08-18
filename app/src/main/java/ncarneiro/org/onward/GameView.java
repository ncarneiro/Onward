package ncarneiro.org.onward;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.view.SurfaceView;

/**
 * Created by Nikolas on 18/08/2015.
 */
public class GameView extends SurfaceView {

    public GameView(Context context) {
        super(context);
    }

    public void paint(Bitmap bitmap) {
        Canvas canvas = getHolder().lockCanvas();
        canvas.drawBitmap(bitmap, 0, 0, null);
        getHolder().unlockCanvasAndPost(canvas);
    }

}