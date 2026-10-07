public class Cactus extends Plant{


    //Constructor
    public Cactus(String name, float cmHeight){
        super(name, cmHeight);
        float calculation = 2; //Kaktus ska alltid ha 2cl oberoende av höjd
        calculateMeasurement(calculation);
    }

    public LiquidType getliquidType(){
        return LiquidType.MINERALVATTEN;
    }


}
