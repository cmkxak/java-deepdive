package thread;

public class ExThread extends Thread {

    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "]: " + this.getClass().getSimpleName() + " - run()");
    }
}
