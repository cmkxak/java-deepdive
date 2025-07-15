package thread.problem;

import static utils.CustomLogger.log;

public class Problem2 {
    private static int START = 1;
    private static int MAX = 5;

    public static void main(String[] args) {
        Thread thread = new Thread(new CounterRunnable(), "counter");
        thread.start();
    }

    static class CounterRunnable implements Runnable {
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
}
