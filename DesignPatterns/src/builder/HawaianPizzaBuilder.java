package builder;

public class HawaianPizzaBuilder extends PizzaBuilder {

    public HawaianPizzaBuilder() {
        super();
        this.pizza = new Pizza();
    }

    @Override
    public void makeDough() {
        this.pizza.setDough(Dough.THICK);
    }

    @Override
    public void makeSauce() {
        this.pizza.setSauce(Sauce.CARBONARA);
    }

    @Override
    public void makeToppings() {
        this.pizza.setToppings(Toppings.PINEAPPLE, Toppings.HAM);
    }

    @Override
    public Pizza getPizza() {
        return this.pizza;
    }
}
