package state;

public class ReadyState extends State {
    public ReadyState(VendingMachineUI app) {
        super(app);
    }

    @Override
    public void insert() {
        app.qtyMoney++;
        app.display(Integer.toString(app.qtyMoney));
    }

    @Override
    public void eject() {
        System.out.println("Returning money");
        app.qtyMoney = 0;
        app.display(Integer.toString(app.qtyMoney));
        app.currentState = app.initState;
    }

    @Override
    public void dispense() {
        if(app.qtyProducts > 1)
        {
            if(app.qtyMoney < app.qtyProducts)
            {
                System.out.println("Dispensing product(s)");
                app.qtyProducts = app.qtyProducts - app.qtyMoney;
                app.qtyMoney = 0;
                app.display(Integer.toString(app.qtyMoney));
                app.currentState = app.initState;
            }
            else
            {
                if(app.qtyMoney == app.qtyProducts)
                {
                    System.out.println("Dispensing product(s)");
                    app.qtyProducts = 0;
                    app.qtyMoney = 0;
                    app.display("Out of Stock");
                    app.currentState = app.outOfStockState;
                }
                else
                {
                    System.out.println("Dispensing product(s)");
                    System.out.println("Returning Money");
                    app.qtyProducts = 0;
                    app.qtyMoney = 0;
                    app.display("Out of Stock");
                    app.currentState = app.outOfStockState;
                }
            }
        }
        else
        {
            System.out.println("Dispensing product(s)");
            app.qtyProducts = 0;
            app.qtyMoney = 0;
            app.display("Out of Stock");
            app.currentState = app.outOfStockState;
        }
    }
}
