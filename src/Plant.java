public class Plant {
    private String name;
    protected float cmHeight;
    protected float clLiquidAmount;   //liquid amount in cl
    protected String liquidMeasurement;

    public Plant(String name, float cmHeight) {
        this.name = name;
        this.cmHeight = cmHeight;
    }

    public String getLiquidAmount() {
        return clLiquidAmount + liquidMeasurement;
    }

    public String getName() {
        return name;
    }

    public float getHeight() {
        return cmHeight;
    }

    //Method that is called on from each plant to
    protected void calculateMeasurement(float calculation) {
        //372cl -> 3.72L    72cl -> 7.2dl   2cl -> 2cl
        if (Math.floor(calculation) < 10){
            this.liquidMeasurement = "cl";
            this.clLiquidAmount = calculation;      //cl
            return;
        }
        if (Math.floor(calculation) < 100){
            this.liquidMeasurement = "dl";
            this.clLiquidAmount = calculation/10;   //dl
            return;
        }
        this.liquidMeasurement = "L";
        this.clLiquidAmount = calculation/100;      //L
    }
}
