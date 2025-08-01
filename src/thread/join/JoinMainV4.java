package thread.join;

import thread.utils.ThreadUtils;
import utils.CustomLogger;

import static utils.CustomLogger.log;

/**
 * join(long ms) 메소드를 통해 호출 스레드가 특정 스레드의 작업이 종료될 때 까지 특정 시간만큼만 대기한다.
 */
public class JoinMainV4 {
    public static void main(String[] args) throws InterruptedException {

        log("start");

        JoinMainV1.SumTask firstTask = new JoinMainV1.SumTask(1, 50);
        JoinMainV1.SumTask secondTask = new JoinMainV1.SumTask(51, 100);

        Thread thread1 = new Thread(firstTask, "thread-1");
        Thread thread2 = new Thread(secondTask, "thread-2");

        thread1.start();
        thread2.start();

        log("main 스레드 대기 시작");
        thread1.join(1000);
        thread2.join(1000);
        log("main 스레드 대기 종료");

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
            log("작업 시작");
            ThreadUtils.sleep(2000);
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            log("작업 종료 - sum : " + sum);
        }

    }
}
