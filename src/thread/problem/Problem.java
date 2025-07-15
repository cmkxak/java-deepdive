package thread.problem;

public class Problem {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

}
