package consultations.consultation01;

public class ThreadCalc extends Thread {
    private final int rangeStart;
    private final int rangeEnd;

    private int counterThread;

    public ThreadCalc(int rangeStart, int rangeEnd) {
        this.rangeStart = rangeStart;
        this.rangeEnd = rangeEnd;
    }

    public int getCounterThread() {
        return counterThread;
    }

    @Override
    public void run() {
        for (int i = rangeStart; i <= rangeEnd; i++) {
            if (i % 21 == 0 && String.valueOf(i).contains("3")) {
                App.incremenntCounter();
//                counterThread++;
            }
        }
    }
}
