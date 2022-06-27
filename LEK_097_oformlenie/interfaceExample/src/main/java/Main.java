public class Main {
    public static void main(String[] args) {

        Z4 model2002 = new Z4 ("Z4M2002-010223", IgnitionTypes.KEY);
        Z4 model2003 = new Z4 ("Z4M2002-010223", IgnitionTypes.BUTTON);
        Z4 model2004 = new Z4 ("Z4M2002-010223", IgnitionTypes.REMOTE);
        Z4 model2005 = new Z4 ("Z4M2002-010223", IgnitionTypes.VOICE);

        System.out.println(model2002.start());
        System.out.println(model2002.drive(2999));
        System.out.println(model2002.notifyOutOfGas());
        System.out.println(model2002.stop());

        System.out.println(model2003.start());
        System.out.println(model2003.fillUpTank(GasType.DIESEL, 344));
        System.out.println(model2003.fillUpTank(GasType.WOOD, 344));
        System.out.println(model2003.fillUpTank(GasType.VODKA, 344));
        System.out.println(model2003.stop());

        System.out.println(model2003.start());
        System.out.println("has Air condition: " + model2003.isAirConditionPresent());

        System.out.println(model2004.getGasLevel());
        System.out.println(model2004.fillUpTank(GasType.VODKA, 443));
        System.out.println(model2004.drive(23));
        System.out.println(model2004.stop());
    }
}
