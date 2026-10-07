public class Palms extends Plant {
    private String liquid = "kranvatten";
    private float clLiquidAmount;   //Liquid amount in cl
    //private float cmHeight;          //Plant height in cm

    //Constructor
    public Palms(String name, float cmHeight){
        super(name, cmHeight);
    }

    //Method for determining clLiquidAmount based on cmHeight
    public float calculateLiquidAmount(){
        //0,5 liter per dag gånger längden i meter
        //0.5L = 50cl   1m = 100cm  ->  50cl per 100cm  ->  0.5cl per cm
        return this.clLiquidAmount = getPlantHeight() / 2;
    }


}
