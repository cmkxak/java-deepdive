package thread.runnable;

public class ExampleRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("[" + Thread.currentThread().getName() + "] : " + this.getClass().getSimpleName() + ": Thread by Runnable Interface");
    }
}
