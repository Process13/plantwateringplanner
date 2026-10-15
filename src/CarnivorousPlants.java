public class CarnivorousPlants extends Plant {

    //Constructor
    public CarnivorousPlants(String name, float cmHeight){
        super(name, cmHeight);
        setFormula();
    }

    //Anger vad för typ av vätska köttätande växter ska få.
    public LiquidType getLiquidType(){
        return LiquidType.PROTEINDRYCK;
    }

    //Metoden innehåller den formula som bestämmer hur mucket vätska köttätande växter ska ha.
    private void setFormula(){
        //0,1 liter per dag plus 0,2 liter gånger längden i meter
        //10cl + (20cl * getMeterHeight()) = clLiquidAmount

        float formula =
                CentiliterValues.TEN_CENTILITERS.getClValue()
                + (
                        CentiliterValues.TWENTY_CENTILITERS.getClValue()
                        * getMeterHeight()
                );
        setCalculatedMeasurement(formula);
    }
}
