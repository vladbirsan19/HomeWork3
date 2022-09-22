package homework3;

public abstract class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");

    }

    public abstract int shiftGear(int g1, int g2, int g3, int g4, int g5, int g6);

    {
        int g1 = 1;
        int g2 = 2;
        int g3 = 3;
        int g4 = 4;
        int g5 = 5;
        int g6 = 6;




    }


    public abstract int shiftGear(int gear);

    @Override
    public float drive(float distance) {
        float d = distance;
        distance = d;

        System.out.println("Car drove " + distance);

        return distance;
    }

    public abstract void drive(double distance);

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }
}
