package thread;

public class Main {

    public static void main(String[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() start");

        ExThread exThread = new ExThread();
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 전");
        exThread.run();
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 후");

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() end");
    }
}
