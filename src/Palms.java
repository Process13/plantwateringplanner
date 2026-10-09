public class Palms extends Plant {

    //Constructor
    public Palms(String name, float cmHeight){
        super(name, cmHeight);
        calculateLiquidAmount();
    }

    public LiquidType getliquidType(){
        return LiquidType.KRANVATTEN;
    }

    //Method for determining clLiquidAmount based on cmHeight
    private void calculateLiquidAmount(){
        //0,5 liter per dag gånger längden i meter
        //0.5L = 50cl   1m = 100cm  ->  50cl per 100cm  ->  0.5cl per cm
        float calculation = getCmHeight() / 2;
        calculateMeasurement(calculation);
    }


}
