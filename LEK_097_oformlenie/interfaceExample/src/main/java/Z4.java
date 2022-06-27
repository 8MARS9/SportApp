public class Z4 extends BMWCar implements Car, EUSpec {

    private String modelSN;
    private IgnitionTypes ignitionType;
    private float gasLevel;
    private final GasType gasType = GasType.VODKA;;
    private int maxPassengers;

    public Z4(String modelSN, IgnitionTypes ignitionType) {
        this.modelSN = modelSN;
        this.ignitionType = ignitionType;
    }

    @Override
    void activeCollisionDetection() {

    }

    @Override
    public String start() {
        return this.modelSN + " Started using " + this.ignitionType;
    }

    @Override
    public String stop() {
        return this.modelSN + " Stopped using brakes";
    }

    @Override
    public float getGasLevel() {
        return gasLevel;
    }

    @Override
    public String fillUpTank(GasType gsType, float amountOfGas) {
    if(!gasType.equals(this.gasType))
        return "Help!, not compatible" + gasType;
    this.gasLevel += amountOfGas;
    return "Filling Complete. " + this.gasType + " level " + this.gasLevel;
    }

    @Override
    public String drive(float meters) {
    if (this
            .gasLevel <= 0) return "not enough gas";
    this.gasLevel -= meters / maxCO2Emission;
        return "driving 20 meters";
    }

    @Override
    public boolean isAirConditionPresent() {
        return false;
    }

    @Override
    public String calculateMaximumAllowedWeight() {
        return "max allowed weight is: 500 kg";
    }

    @Override
    public void setMaxPassengers(int numberOfPassengers) {
    this.maxPassengers = numberOfPassengers;

    }

    @Override
    public int getMaxPassengers() {
        return this.maxPassengers;
    }
}
