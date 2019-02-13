package state;

public class InitState extends State {

    public InitState(VendingMachineUI app) {
        super(app);
    }

    @Override
    public void insert() {
        app.qtyMoney++;
        app.display(Integer.toString(app.qtyMoney));
        app.currentState = app.readyState;
    }

    @Override
    public void eject() {

    }

    @Override
    public void dispense() {

    }
}
