package thread.utils;

import utils.CustomLogger;

public abstract class ThreadUtils {

    public static void sleep(long mills) {
        try {
            Thread.sleep(mills);
        } catch (InterruptedException e) {
            CustomLogger.log("인터럽트 발생, " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

}
