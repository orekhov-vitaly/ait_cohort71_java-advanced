package lessons.lesson02.app.staff.administration;

import lessons.lesson02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson02.app.staff.specialists.productions.StoreKeeper;

public class ProductChief {
    private MachineOperator machineOperator;
    private StoreKeeper storeKeeper;

    public void setMachineOperator(MachineOperator machineOperator) {
        this.machineOperator = machineOperator;
    }

    public void setStoreKeeper(StoreKeeper storeKeeper) {
        this.storeKeeper = storeKeeper;
    }

    public MachineOperator getMachineOperator() {
        return machineOperator;
    }

    public StoreKeeper getStoreKeeper() {
        return storeKeeper;
    }

    public void giveOrders() {
        machineOperator.work();
        storeKeeper.work();
    }
}
