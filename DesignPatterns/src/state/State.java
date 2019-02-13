package state;

public abstract class State {
    protected VendingMachineUI app;
    public State(VendingMachineUI app) {
        this.app = app;
    }
    abstract void insert();
    abstract void eject();
    abstract void dispense();
}
