package lessons.lesson02.app.staff.administration;

import lessons.lesson02.app.staff.specialists.sales.Merchandiser;
import lessons.lesson02.app.staff.specialists.sales.SaleManager;

public class SalesChief {
    private Merchandiser merchandiser;
    private SaleManager saleManager;

    public void giveOrders() {
        merchandiser.work();
        saleManager.work();
    }

    public Merchandiser getMerchandiser() {
        return merchandiser;
    }

    public void setMerchandiser(Merchandiser merchandiser) {
        this.merchandiser = merchandiser;
    }

    public SaleManager getSaleManager() {
        return saleManager;
    }

    public void setSaleManager(SaleManager saleManager) {
        this.saleManager = saleManager;
    }
}
