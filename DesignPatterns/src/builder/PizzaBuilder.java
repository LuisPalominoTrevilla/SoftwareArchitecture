package builder;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public abstract void makeDough();
    public abstract void makeSauce();
    public abstract void makeToppings();
    public abstract Pizza getPizza();
}
