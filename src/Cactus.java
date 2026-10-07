public class Cactus extends Plant{

    //Constructor
    public Cactus(String name, float cmHeight){
        super(name, cmHeight);
        this.liquidType = "kranvatten";
        this.clLiquidAmount = 2F;
        this.liquidMeasurement = "cl";
    }
}
