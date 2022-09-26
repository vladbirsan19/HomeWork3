package homework3;

public class VolkswagenPolo extends Volkswagen{
    final int fuelTankSize;
    final String fuelType1;
    final String fuelType2;
    final String fuelType3;

    public String getFuelType1() {
        System.out.println("The fuel type is :" + fuelType1);
        return fuelType1;
    }

    public String getFuelType2() {
        System.out.println("The fuel type is :" + fuelType2);
        return fuelType2;
    }

    public String getFuelType3() {
        System.out.println("The fuel type is :" + fuelType3);
        return fuelType3;
    }

    public int getFuelTankSize() {
        System.out.println( "The fuel tank size is: " +fuelTankSize);
        return fuelTankSize;
    }

    public VolkswagenPolo() {

        fuelTankSize = 40;
        fuelType1 = "Petrol";
        fuelType2 = "Hybrid";
        fuelType3 = "Diesel";



    }

    @Override
    public void start() {
        super.start();
    }


    @Override
    public int shiftGear() {
        return 0;
    }

    @Override
    public int shiftGear(int g1, int g2, int g3, int g4, int g5, int g6) {
        return 0;
    }

    @Override
    public int shiftGear(int gear) {
        return super.shiftGear(gear);
    }



    @Override
    public double drive(double distance) {
        super.drive(distance);


        return distance;
    }


    @Override
    public void stop() {
        super.stop();
    }


    private String modelName = "Polo";


    public String getModelName() {
        return modelName;


    }

    public void setModelName(String modelName) {
        this.modelName = "Focus";
        System.out.println("Your Volkswagen model is:" + modelName);
    }

    private String vinNumber;

    public String getVinNumber() {
        this.vinNumber=vinNumber;
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        this.vinNumber = vinNumber;
        System.out.println( "Vehicle identification number of this car is: " + vinNumber);
    }

    private int tireSize;

    public int getTireSize() {
        this.tireSize=tireSize;
        return tireSize;
    }

    public void setTireSize(int tireSize) {
        this.tireSize = tireSize;
        System.out.println("Tire size of this model is: " + tireSize);
    }
}




