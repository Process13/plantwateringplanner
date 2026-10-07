public class CarnivorousPlants extends Plant {

    //Constructor
    public CarnivorousPlants(String name, float cmHeight){
        super(name, cmHeight);
        calculateLiquidAmount();
    }

    public LiquidType getliquidType(){
        return LiquidType.PROTEINDRYCK;
    }

    //Method for determining clLiquidAmount based on cmHeight
    private void calculateLiquidAmount(){
        //0,1 liter per dag plus 0,2 liter gånger längden i meter
        //0.1L = 10cl   1m = 100cm  ->  10cl + (20cl * cmHeight) = clLiquidAmount
        float calculation = 10 + (20 * getHeight());
        calculateMeasurement(calculation);
    }
}
