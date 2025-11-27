package consultations.consultation01;

public class App {
    private static int counter;

    public static synchronized void incremenntCounter() {
        counter++;
    }

//    public static void incremenntCounter() {
//        counter++;
//    }

    public static void main(String[] args) {
        singleThreadSolution();
        counter = 0;
        towThreadSolution();
        counter = 0;
        multiThreadSolution();
    }

    private static void singleThreadSolution() {
        ThreadCalc myThread = new ThreadCalc(1, 2_000_000);

        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value with single thread: " + counter);
    }

    private static void towThreadSolution() {
        ThreadCalc myThread1 = new ThreadCalc(1, 1_000_000);
        ThreadCalc myThread2 = new ThreadCalc(1_000_000, 2_000_000);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value with tow threads: " + counter);
//        System.out.println("Counter value with tow threads: " + (myThread1.getCounterThread() + myThread2.getCounterThread()));
    }

    private static void multiThreadSolution() {
        ThreadCalc myThread1 = new ThreadCalc(1, 500_000);
        ThreadCalc myThread2 = new ThreadCalc(500_001, 1_000_000);
        ThreadCalc myThread3 = new ThreadCalc(1_000_001, 1_500_000);
        ThreadCalc myThread4 = new ThreadCalc(1_500_001, 2_000_000);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();

        try {
            myThread1.join();
            myThread2.join();
            myThread3.join();
            myThread4.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Counter value with multi threads: " + counter);
//        System.out.println("Counter value with tow threads: " + (myThread1.getCounterThread() + myThread2.getCounterThread()));
    }
}
