package thread.problem;

import static utils.CustomLogger.log;

public class Problem4 {

    public static void main(String[] args) {
        while (true) {
            //thread a - print a per 1sec
            Thread threadA = new Thread(() -> {
                log("A");
                delay1Sec();
            });
            threadA.setName("thread-A");

            Thread threadB = new Thread(() -> {
                log("B");
                delay500ms();
            });
            threadB.setName("thread-B");

            threadA.start();
            threadB.start();
        }
    }

    private static void delay1Sec() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private static void delay500ms() {
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
