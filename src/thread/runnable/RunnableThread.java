package thread.runnable;

public class RunnableThread {

    public static void main(String[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() start");

        ExampleRunnable runnable = new ExampleRunnable();
        Thread thread = new Thread(runnable);

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 전");

        thread.start();

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 후");

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() end");

    }
}
