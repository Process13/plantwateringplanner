public class Cactus extends Plant{
    //Cactus ärver från Plant

    public Cactus(String name, float cmHeight){
        super(name, cmHeight);
    }

    public LiquidType getLiquidType(){
        return LiquidType.MINERALVATTEN;
    }

    public float getClLiquidAmount(){
        return CentiliterValues.TWO_CENTILITERS.getClValue();
    }


}
