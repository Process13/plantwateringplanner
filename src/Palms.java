public class Palms extends Plant {

    public Palms(String name, float cmHeight){
        super(name, cmHeight);
        setClFormula();
    }

    public LiquidType getLiquidType(){
        return LiquidType.KRANVATTEN;
    }

    public void setClFormula(){
        float clFormula = getCmHeight() / 2;
        setCalculatedMeasurement(clFormula);
    }


}
