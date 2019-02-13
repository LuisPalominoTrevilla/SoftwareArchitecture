package state;

public class OutOfStockState extends State {
    public OutOfStockState(VendingMachineUI app) {
        super(app);
    }

    @Override
    public void insert() {
        System.out.println("Returning Money");
        app.display("Out of Stock");
    }

    @Override
    public void eject() {

    }

    @Override
    public void dispense() {

    }
}
