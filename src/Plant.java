public class Plant {

    private String name;
    protected float cmHeight;
    protected float clLiquidAmount;   //liquid amount in cl
    protected String liquidMeasurement;

    //Constructor
    public Plant(String name, float cmHeight) {
        this.name = name;
        this.cmHeight = cmHeight;
    }


    public String getName() {
        return name;
    }

    public float getCmHeight() {
        return cmHeight;
    }

    public float getMeterHeight() {
        return cmHeight/100;
    }

    public String getLiquidAmountStr() {
        return clLiquidAmount + liquidMeasurement;
    }


    //Method that is called on from each plant to calculate the value
    protected void setCalculatedMeasurement(float formula) {

        //372cl -> 3.72L    72cl -> 7.2dl   2cl -> 2cl
        if (Math.floor(formula) < 10){  //If less than 10 cl, use cl
            this.liquidMeasurement = LiquidMeasurementsMetric.CL.toString();
            this.clLiquidAmount = formula;      //cl
            return;
        }
        if (Math.floor(formula) < 100){ //If less than 10dl, use dl
            this.liquidMeasurement = LiquidMeasurementsMetric.DL.toString();
            this.clLiquidAmount = formula/10;   //dl
            return;
        }
        this.liquidMeasurement = LiquidMeasurementsMetric.L.toString();
        this.clLiquidAmount = formula/100;      //L
    }
    //System.out.println("\n" + igge.getName() + " ska vattnas med " +
    // igge.getLiquidAmount() + " " + igge.getliquidType() + " dagligen.");
    @Override
    public String toString() {
        return getName()
                + " ska vattnas med "
                + getLiquidAmountStr()
                + " ";
    }
}
