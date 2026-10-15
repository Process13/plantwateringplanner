public abstract class Plant implements PlantLiquid {

    private String name;
    protected float cmHeight;
    protected float clLiquidAmount;
    protected String liquidMeasurement;

    public Plant(String name, float cmHeight) {
        this.name = name;
        this.cmHeight = cmHeight;
    }


    public String getName() {
        return name;
    }

    public float getCmHeight() {
        return cmHeight;
    }

    public float getMeterHeight() {
        return cmHeight/100;
    }

    public String getLiquidAmountStr() {
        return clLiquidAmount + liquidMeasurement;
    }

    protected void setCalculatedMeasurement(float clFormula) {

        if (Math.floor(clFormula) < CentiliterValues.TEN_CENTILITERS.getClValue()){
            this.liquidMeasurement = LiquidMeasurementsMetric.CL.toString();
            this.clLiquidAmount = clFormula;
            return;
        }
        if (Math.floor(clFormula) < CentiliterValues.ONE_HUNDRED_CENTILITERS.getClValue()){
            this.liquidMeasurement = LiquidMeasurementsMetric.DL.toString();
            this.clLiquidAmount = clFormula/10;
            return;
        }
        this.liquidMeasurement = LiquidMeasurementsMetric.L.toString();
        this.clLiquidAmount = clFormula/100;
    }

    @Override
    public String toString() {
        return getName()
                + " ska vattnas med "
                + getLiquidAmountStr()
                + " ";
    }
}
