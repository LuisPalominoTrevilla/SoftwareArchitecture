package builder;

public enum Sauce {
    CARBONARA {
        @Override
        public String toString() {
            return "carbonara";
        }
    },
    BARBACOA {
        @Override
        public String toString() {
            return "barbacoa";
        }
    }
}
