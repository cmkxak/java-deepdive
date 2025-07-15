package thread.problem;

import utils.CustomLogger;

import static utils.CustomLogger.*;

public class CounterThread extends Thread {

    private static int MAX = 5;
    private static int START = 1;

    @Override
    public void run() {
        for (int i = START; i <= MAX; i++) {
            log("value: " + i);
            delay1Sec();
        }
    }

    private void delay1Sec() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
