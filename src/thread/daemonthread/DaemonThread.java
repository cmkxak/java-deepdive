package thread.daemonthread;

public class DaemonThread extends Thread {

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "]" + this.getName() + ": 10s wait start ...");

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("[" + Thread.currentThread().getName() + "]" + this.getName() + ": 10s wait end ...");
    }
}
