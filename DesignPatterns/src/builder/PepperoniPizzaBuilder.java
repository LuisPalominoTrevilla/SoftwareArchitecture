package builder;

public class PepperoniPizzaBuilder extends PizzaBuilder {

    public PepperoniPizzaBuilder() {
        super();
        this.pizza = new Pizza();
    }

    @Override
    public void makeDough() {
        this.pizza.setDough(Dough.THIN);
    }

    @Override
    public void makeSauce() {
        this.pizza.setSauce(Sauce.BARBACOA);
    }

    @Override
    public void makeToppings() {
        this.pizza.setToppings(Toppings.PEPPERONI, Toppings.HAM);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}