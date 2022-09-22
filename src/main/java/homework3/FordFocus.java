package homework3;

public class FordFocus extends Ford {
    public FordFocus() {

    }

    @Override
    public void start() {
        super.start();
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
    public float drive(float distance) {
        return super.drive(distance);
    }

    @Override
    public void drive(double distance) {
        super.drive(distance);
    }

    @Override
    public void stop() {
        super.stop();
    }
}


