public enum LiquidMeasurementsMetric {
    CL,
    DL,
    L;

    @Override
    public String toString() {
        if (this == LiquidMeasurementsMetric.L) {   //Endast L har stor bokstav
            return name();
        }
        return name().toLowerCase();
    }
}
