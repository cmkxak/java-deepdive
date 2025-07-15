package thread.join;

import thread.utils.ThreadUtils;
import utils.CustomLogger;

import static utils.CustomLogger.log;

/**
 * sleep을 통해 스레드가 특정 시간만큼 대기하도록 한다.
 */
public class JoinMainV2 {
    public static void main(String[] args) {
        log("start");

        JoinMainV1.SumTask firstTask = new JoinMainV1.SumTask(1, 50);
        JoinMainV1.SumTask secondTask = new JoinMainV1.SumTask(51, 100);

        Thread thread1 = new Thread(firstTask, "thread-1");
        Thread thread2 = new Thread(secondTask, "thread-2");

        thread1.start();
        thread2.start();

        ThreadUtils.sleep(3500);
        int totalSum = firstTask.sum + secondTask.sum;
        log("task 1 + task 2 : " + totalSum);
        log("end");
    }

    static class SumTask implements Runnable {

        int start;
        int end;
        int sum;

        public SumTask(int start, int end) {
            this.start = start;
            this.end = end;
        }

        @Override
        public void run() {
            CustomLogger.log("작업 시작");
            ThreadUtils.sleep(2000);
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            CustomLogger.log("작업 종료 - sum : " + sum);
        }
    }
}
