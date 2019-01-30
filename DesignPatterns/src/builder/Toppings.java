package builder;

public enum Toppings {
    PINEAPPLE {
        @Override
        public String toString() {
            return "piña";
        }
    },
    HAM {
        @Override
        public String toString() {
            return "jamón";
        }
    },
    PEPPERONI {
        @Override
        public String toString() {
            return "peperoni";
        }
    }
}
