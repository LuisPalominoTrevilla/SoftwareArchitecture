package builder;

public class Cocina {
    private PizzaBuilder builder;

    public void buildPizza() {
        this.builder.makeDough();
        this.builder.makeSauce();
        this.builder.makeToppings();
    }
    public void setPizzaBuilder(PizzaBuilder builder) {
        this.builder = builder;
    }
    public Pizza getPizza() {
        return this.builder.getPizza();
    }
}
