package homeworks.homework01;

//*Задание: Создайте программу, которая выполняет задачу двумя способами:
//
//Последовательно (без потоков) - подсчитайте сумму чисел от 1 до 1,000,000
//Параллельно (с двумя потоками) - первый поток считает от 1 до 500,000, второй от 500,001 до 1,000,000
//Замерьте и выведите время выполнения для обоих способов.
//
//Подсказка: Используйте System.currentTimeMillis() для замера времени.*/

public class Main {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        singleThreadSolution();
        long endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        towThreadSolution();
        endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));
    }

    private static void singleThreadSolution() {
        ThreadSum myThread = new ThreadSum(1, 1_000_000);

        myThread.start();

        try {
            myThread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum with single thread: " + myThread.getSumThread());
    }

    private static void towThreadSolution() {
        ThreadSum myThread1 = new ThreadSum(1, 500_000);
        ThreadSum myThread2 = new ThreadSum(500_001, 1_000_000);

        myThread1.start();
        myThread2.start();

        try {
            myThread1.join();
            myThread2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Sum with two threads: " + (myThread1.getSumThread() + myThread2.getSumThread()));
    }
}
