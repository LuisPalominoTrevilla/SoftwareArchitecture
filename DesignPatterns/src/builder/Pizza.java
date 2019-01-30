package builder;

public class Pizza {
    private Dough dough;
    private Sauce sauce;
    private Toppings[] toppings;

    public void setDough(Dough dough) {
        this.dough = dough;
    }

    public void setSauce(Sauce sauce) {
        this.sauce = sauce;
    }

    public void setToppings(Toppings... toppings) {
        this.toppings = toppings;
    }

    @Override
    public String toString() {
        String ingredients = "";
        for (Toppings t: this.toppings) {
            ingredients += t + ", ";
        }
        return String.format("Pizza en masa %s con salsa %s y con los mejores ingredientes: %s", this.dough, this.sauce, ingredients);
    }
}
