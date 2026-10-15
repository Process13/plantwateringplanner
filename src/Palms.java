public class Palms extends Plant {

    //Constructor
    public Palms(String name, float cmHeight){
        super(name, cmHeight);
        setFormula();
    }

    //Anger vad för typ av vätska palmer ska få.
    public LiquidType getLiquidType(){
        return LiquidType.KRANVATTEN;
    }

    //Metoden innehåller den formula som bestämmer hur mucket vätska palmer ska ha.
    private void setFormula(){
        float formula = getCmHeight() / 2;
        setCalculatedMeasurement(formula);
    }


}
