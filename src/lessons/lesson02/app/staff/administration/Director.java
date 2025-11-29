package lessons.lesson02.app.staff.administration;

import lessons.lesson02.app.staff.specialists.Secretary;
import org.springframework.beans.factory.annotation.Autowired;

public class Director {
    @Autowired
    private ProductChief productChief;
    @Autowired
    private SalesChief salesChief;
    @Autowired
    private Secretary secretary;

    public void manageCompany() {
        secretary.work();
        productChief.giveOrders();
        salesChief.giveOrders();
    }

    public ProductChief getProductChief() {
        return productChief;
    }

    public void setProductChief(ProductChief productChief) {
        this.productChief = productChief;
    }

    public SalesChief getSalesChief() {
        return salesChief;
    }

    public void setSalesChief(SalesChief salesChief) {
        this.salesChief = salesChief;
    }

    public Secretary getSecretary() {
        return secretary;
    }

    public void setSecretary(Secretary secretary) {
        this.secretary = secretary;
    }
}
