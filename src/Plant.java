public class Plant {
    private String name;
    protected float cmHeight;
    protected float clLiquidAmount;   //liquid amount in cl
    protected String liquidType;
    protected String liquidMeasurement;

    public Plant(String name, float cmHeight) {
        this.name = name;
        this.cmHeight = cmHeight;
    }

    public String getName() {
        return name;
    }


    public String getPlantLiquidType() {
        return liquidType;
    }

    public String getClLiquidAmount() {
        return name + " behöver " + clLiquidAmount + liquidMeasurement + " dagligen";
    }

    public String getPlantName() {
        return name;
    }

    public float getPlantHeight() {
        return cmHeight;
    }

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
