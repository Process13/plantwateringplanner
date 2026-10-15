public enum CentiliterValues {
    TWO_CENTILITERS(2),
    TEN_CENTILITERS(10),
    TWENTY_CENTILITERS(20);

    private int clValue;

    CentiliterValues(int clValue) {
        this.clValue = clValue;
    }

    public int getClValue() {
        return clValue;
    }
}
