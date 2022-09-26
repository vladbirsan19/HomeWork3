package homework3;

public abstract class Volkswagen extends Car{

    @Override
    public void start() {
        super.start();
    }

    public abstract int shiftGear(int g1, int g2, int g3, int g4, int g5, int g6);

    @Override
    public int shiftGear(int gear) {

        this.gear = gear;
        if (gear <= 6) {
            System.out.println("Car shifted to gear: " + gear);
            gear++;
        }
        return gear;
    }

    @Override
    public double drive(double distance) {
        return super.drive(distance);
    }



    @Override
    public void stop() {
        super.stop();
    }
}

