public interface Car {
    String start();
    String stop();
    float getGasLevel();
    String fillUpTank(GasType gsType, float amountOfGas);
    String drive(float meters);
    boolean isAirConditionPresent();
}
