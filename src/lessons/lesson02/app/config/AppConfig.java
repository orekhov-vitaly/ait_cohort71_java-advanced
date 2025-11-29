package lessons.lesson02.app.config;

import lessons.lesson02.app.staff.administration.Director;
import lessons.lesson02.app.staff.administration.ProductChief;
import lessons.lesson02.app.staff.administration.SalesChief;
import lessons.lesson02.app.staff.specialists.Secretary;
import lessons.lesson02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson02.app.staff.specialists.productions.StoreKeeper;
import lessons.lesson02.app.staff.specialists.sales.Merchandiser;
import lessons.lesson02.app.staff.specialists.sales.SaleManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public Director getDirector() {
        return new Director();
    }

    @Bean
    public ProductChief getProductChief() {
        return new ProductChief();
    }

    @Bean
    public SalesChief getSalesChief() {
        return new SalesChief();
    }

    @Bean
    public MachineOperator getMachineOperator() {
        return new MachineOperator();
    }

    @Bean
    public StoreKeeper getStoreKeeper() {
        return new StoreKeeper();
    }

    @Bean
    public Merchandiser getMerchandiser() {
        return new Merchandiser();
    }

    @Bean
    public SaleManager getSaleManager() {
        return new SaleManager();
    }

    @Bean
    public Secretary getSecretary() {
        return new Secretary();
    }
}
