public class CarnivorousPlants extends Plant {
    //CarnivorousPlants ärver från Plant

    public CarnivorousPlants(String name, float cmHeight){
        super(name, cmHeight);
    }

    public LiquidType getLiquidType(){
        return LiquidType.PROTEINDRYCK;
    }

    public float getClLiquidAmount(){
        return CentiliterValues.TEN_CENTILITERS.getClValue()
                + (
                        CentiliterValues.TWENTY_CENTILITERS.getClValue()
                        * getMeterHeight()
                );
    }
}
