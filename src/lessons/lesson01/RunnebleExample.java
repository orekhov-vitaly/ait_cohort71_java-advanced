package lessons.lesson01;

public class RunnebleExample {
    public static void main(String[] args) {
        // Создаем задачи
        Runnable task1 = new CounterTask("Task-A", 5);
        Runnable task2 = new CounterTask("Task-B", 3);

        // Создаем потоки и передаем им задачи
        Thread thread1 = new Thread(task1);
        Thread thread2 = new Thread(task2);

        // Задаем имена нашим потокам для удобства отладки
        thread1.setName("Рабочий-1");
        thread2.setName("Рабочий-2");

        // Запускаем потоки
        thread1.start();
        thread2.start();

        // Можно переиспользовать задачу в другом потоке
        Thread thread3 = new Thread(task1); // та же задача в другом потоке
        thread3.setName("Рабочий-3");
        thread3.start();
    }
}
