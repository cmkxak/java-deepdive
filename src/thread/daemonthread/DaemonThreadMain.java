package thread.daemonthread;

public class DaemonThreadMain {

    public static void main(String[] args) {
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() start");

        DaemonThread daemonThread = new DaemonThread();
//        daemonThread.setDaemon(true); //If this thread is a daemon, it will terminate when the main thread ends..

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 전");
        daemonThread.start();
        System.out.println("[" + Thread.currentThread().getName() + "]" + ": start() 호출 후");

        System.out.println("[" + Thread.currentThread().getName() + "]" + ": main() end");
    }
}
