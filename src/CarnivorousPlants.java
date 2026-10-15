public class CarnivorousPlants extends Plant {

    public CarnivorousPlants(String name, float cmHeight){
        super(name, cmHeight);
        setClFormula();
    }

    public LiquidType getLiquidType(){
        return LiquidType.PROTEINDRYCK;
    }

    private void setClFormula(){
        float clFormula =
                CentiliterValues.TEN_CENTILITERS.getClValue()
                + (
                        CentiliterValues.TWENTY_CENTILITERS.getClValue()
                        * getMeterHeight()
                );
        setCalculatedMeasurement(clFormula);
    }
}
