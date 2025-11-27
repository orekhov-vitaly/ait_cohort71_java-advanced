package homeworks.homework01;

public class ThreadSum extends Thread {
    private final int rangeStart;
    private final int rangeEnd;

    private int sumThread;

    public ThreadSum(int rangeStart, int rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public int getSumThread() {
        return sumThread;
    }

    @Override
    public void run() {
        for (int i = rangeStart; i < rangeEnd; i++) {
            sumThread+=i;
        }
    }
}
