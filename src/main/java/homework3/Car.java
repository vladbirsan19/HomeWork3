package homework3;

import java.util.List;

public abstract class Car implements Vehicle {
    @Override
    public void start() {
        System.out.println("Car started");

    }

    public abstract int shiftGear();

    List<Integer> list = List.of(1, 2, 3, 4, 5, 6);

    public abstract int shiftGear(int gear);
    int gear;

    @Override
    public double drive(double distance) {
        double d = distance;
        distance = d;

        System.out.println("Car drove " + distance +" km.");

        return distance;
    }

    @Override
    public void stop() {
        System.out.println("Car stopped");

    }

}
