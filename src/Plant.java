public abstract class Plant implements PlantLiquid {
    //Interface PlantLiquid används här för att påverka de klasser som ärver plant.
    //Plant behöver inte innehålla metoderna i Interface då den är en abstract class.

    //Inkapsling sker här med private
    private String plantName;
    private float cmHeight;
    private float liquidAmount;
    private String liquidMeasurement;

    public Plant(String plantName, float cmHeight) {
        this.plantName = plantName;
        this.cmHeight = cmHeight;
    }


    public String getPlantName() {
        return plantName;
    }

    public float getCmHeight() {
        return cmHeight;
    }

    public float getMeterHeight() {
        return cmHeight/100;
    }

    public String getLiquidAmountStr() {
        calculateLiquidMeasurement();
        return liquidAmount + liquidMeasurement;
    }

    private void calculateLiquidMeasurement() {

        if (Math.floor(getClLiquidAmount()) < CentiliterValues.TEN_CENTILITERS.getClValue()){
            liquidMeasurement = LiquidMeasurementsMetric.CL.toString();
            liquidAmount = getClLiquidAmount();
            return;
        }
        if (Math.floor(getClLiquidAmount()) < CentiliterValues.ONE_HUNDRED_CENTILITERS.getClValue()){
            liquidMeasurement = LiquidMeasurementsMetric.DL.toString();
            liquidAmount = getClLiquidAmount()/10;
            return;
        }
        liquidMeasurement = LiquidMeasurementsMetric.L.toString();
        liquidAmount = getClLiquidAmount()/100;

        //Polymorfism. getClLiquidAmount() är annorlunda beroende på vilken planta objektet tillhör.
    }

    @Override
    public String toString() {
        return getPlantName()
                + " ska vattnas med "
                + getLiquidAmountStr()
                + " ";
    }
}
