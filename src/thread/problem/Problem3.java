package thread.problem;

import static utils.CustomLogger.log;

public class Problem3 {
    private static int START = 1;
    private static int MAX = 5;

    public static void main(String[] args) {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = START; i <= MAX; i++) {
                    log("value: " + i);
                    delay1Sec();
                }
            }
        };
        Thread thread = new Thread(runnable, "counter");
        thread.start();
    }

    private static void delay1Sec() {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
