package lessons.lesson02.app.staff.administration;

import lessons.lesson02.app.staff.specialists.productions.MachineOperator;
import lessons.lesson02.app.staff.specialists.productions.StoreKeeper;
import org.springframework.beans.factory.annotation.Autowired;

public class ProductChief {

    // @Autowired - данная аннотация говорит Spring-у найти подходящий объект и положить сюда
    @Autowired
    private MachineOperator machineOperator;

    @Autowired
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
