package lessons.lesson02.app.staff.administration;

import lessons.lesson02.app.staff.specialists.Secretary;

public class Director {
    private ProductChief productChief;
    private SalesChief salesChief;
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
