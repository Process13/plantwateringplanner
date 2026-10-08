public enum LiquidType {
    KRANVATTEN,
    MINERALVATTEN,
    PROTEINDRYCK;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
