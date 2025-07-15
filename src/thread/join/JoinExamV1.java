package thread.join;

import thread.utils.ThreadUtils;
import utils.CustomLogger;

public class JoinExamV1 {

    public static void main(String[] args) {
        CustomLogger.log("start");

        Thread thread1 = new Thread(new Job(), "thread-1");
        Thread thread2 = new Thread(new Job(), "thread-2");

        thread1.start();
        thread2.start();

        CustomLogger.log("end ");
    }


    static class Job implements Runnable {
        @Override
        public void run() {
            CustomLogger.log("작업 시작");
            ThreadUtils.sleep(2000);
            CustomLogger.log("작업 종료");
        }
    }
}
