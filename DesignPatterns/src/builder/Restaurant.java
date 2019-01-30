package builder;

public class Restaurant {

    public static void main(String[] args) {
        Cocina cocina = new Cocina();
        PizzaBuilder hawaianPizzaBuilder = new HawaianPizzaBuilder();
        cocina.setPizzaBuilder(hawaianPizzaBuilder);
        cocina.buildPizza();
        Pizza pizza = cocina.getPizza();
        System.out.printf("Pizza: %s", pizza);
    }
}
