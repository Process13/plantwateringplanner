public class Cactus extends Plant{

    public Cactus(String name, float cmHeight){
        super(name, cmHeight);
        setClFormula();
    }

    public LiquidType getLiquidType(){
        return LiquidType.MINERALVATTEN;
    }

    private void setClFormula(){
        float clFormula = CentiliterValues.TWO_CENTILITERS.getClValue();
        setCalculatedMeasurement(clFormula);
    }


}
