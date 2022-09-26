package homework3;

public class Main {
    public static void main(String[] args) {

        FordFocus car1 = new FordFocus();

        car1.setModelName("Ford Focus");

        car1.setVinNumber("WF05XXGCC5JT28033");

        car1.getFuelTankSize();

        car1.getFuelType1();

        //car1.getFuelConsumption();

        car1.setTireSize(18);

        car1.start();

        car1.shiftGear(1);

        car1.drive(0.01); // drives 0.01 KMs

        car1.shiftGear(2);

        car1.drive(0.02);

        car1.shiftGear(3);

        car1.drive(0.5);

        car1.shiftGear(4);

        car1.drive(0.5);

        car1.shiftGear(5);

        car1.drive(0.5);

        car1.shiftGear(6);

        car1.drive(10);

        car1.stop();




    }
}
