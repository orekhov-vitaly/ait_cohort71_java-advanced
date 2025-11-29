package lessons.lesson02.app.code;

import lessons.lesson02.app.staff.administration.Director;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class ApplicationWithSpring {
    public static void main(String[] args) {
        // Запуск приложения со Spring

        // Получаем объект контекста
        AbstractApplicationContext context = new AnnotationConfigApplicationContext("lessons.lesson02.app.config");

        // Из контекста получаем Bean директора
        Director director = context.getBean(Director.class);

        director.manageCompany();
    }
}
