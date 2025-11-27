package homeworks.homework01;

public class ThreadSum extends Thread {
    private final long rangeStart;
    private final long rangeEnd;

    private long sumThread;

    public ThreadSum(int rangeStart, int rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public long getSumThread() {
        return sumThread;
    }

    @Override
    public void run() {
        for (long i = rangeStart; i <= rangeEnd; i++) {
            sumThread+=i;
        }
    }
}
