package lessons.lesson02.app.code;

import lessons.lesson02.app.staff.administration.Director;
import lessons.lesson02.app.staff.administration.ProductChief;
import lessons.lesson02.app.staff.administration.SalesChief;
import lessons.lesson02.app.staff.specialists.Secretary;
import lessons.lesson02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson02.app.staff.specialists.productions.StoreKeeper;
import lessons.lesson02.app.staff.specialists.sales.Merchandiser;
import lessons.lesson02.app.staff.specialists.sales.SaleManager;

public class Application {
    public static void main(String[] args) {
        // Product Department
        MachineOperator machineOperator = new MachineOperator();
        StoreKeeper storeKeeper = new StoreKeeper();

        // Sales Department
        SaleManager saleManager = new SaleManager();
        Merchandiser merchandiser = new Merchandiser();

        Secretary secretary = new Secretary();

        // Administration
        ProductChief productChief = new ProductChief();
        productChief.setMachineOperator(machineOperator);
        productChief.setStoreKeeper(storeKeeper);

        SalesChief salesChief = new SalesChief();
        salesChief.setMerchandiser(merchandiser);
        salesChief.setSaleManager(saleManager);

        Director director = new Director();
        director.setSecretary(secretary);
        director.setProductChief(productChief);
        director.setSalesChief(salesChief);

        director.manageCompany();
    }
}
