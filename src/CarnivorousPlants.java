public class CarnivorousPlants extends Plant {

    //Constructor
    public CarnivorousPlants(String name, float cmHeight){
        super(name, cmHeight);
        this.liquidType = "proteindryck";
    }

    //Method for determining clLiquidAmount based on cmHeight
    public float calculateLiquidAmount(){
        //0,1 liter per dag plus 0,2 liter gånger längden i meter
        //0.1L = 10cl   1m = 100cm  ->  10cl + (20cl * cmHeight) = clLiquidAmount
        float calc = clLiquidAmount = 10 + (20 * getPlantHeight());
        calculateMeasurement(calc);
        return calc;
    }
}
