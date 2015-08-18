package ncarneiro.org.onward;

/**
 * Created by Nikolas on 18/08/2015.
 */
public class GameLoopThread extends Thread {

    private boolean running;

    private void getInput(){}
    private void updateLogic(){}
    private void updateGraphics(){}

    @Override
    public void run() {
        //super.run();
        while (running) {
            getInput();
            updateLogic();
            updateGraphics();
            try {
                Thread.sleep(15);//give some time for cpu do some other stuff
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
