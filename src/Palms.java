public class Palms extends Plant {
    //Palms ärver från Plant

    public Palms(String name, float cmHeight){
        super(name, cmHeight);
    }

    public LiquidType getLiquidType(){
        return LiquidType.KRANVATTEN;
    }

    public float getClLiquidAmount(){
        return getCmHeight() / 2;
    }


}
