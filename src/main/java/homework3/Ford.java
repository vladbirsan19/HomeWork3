package homework3;

public abstract class Ford extends Car {

    @Override
    public void start() {
        super.start();
    }

    @Override
    public int shiftGear(int gear) {

        for (gear = gear; gear <=6 ;  gear++) {
            System.out.println("Car shifted " + gear);
        }
        return gear;


    }

    @Override
    public float drive(float distance) {
        return super.drive(distance);
    }

    @Override
    public void drive(double distance) {

    }

    @Override
    public void stop() {
        super.stop();
    }
}
