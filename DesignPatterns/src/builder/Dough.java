package builder;

public enum Dough {
    THIN {
        @Override
        public String toString() {
            return "delgada";
        }
    },
    THICK {
        @Override
        public String toString() {
            return "gruesa";
        }
    }
}
