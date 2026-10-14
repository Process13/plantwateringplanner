public class Cactus extends Plant{

    //Constructor
    public Cactus(String name, float cmHeight){
        super(name, cmHeight);
        setFormula();
    }

    //Anger vad för typ av vätska kaktusar ska få.
    public LiquidType getLiquidType(){
        return LiquidType.MINERALVATTEN;
    }

    //Metoden innehåller den formula som bestämmer hur mucket vätska kaktusar ska ha.
    private void setFormula(){
        //Kaktus ska alltid ha 2cl oberoende av höjd

        float formula = 2;
        setCalculatedMeasurement(formula);
    }


}
