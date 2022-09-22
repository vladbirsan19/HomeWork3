package homework3;

public class Main {
    public static void main(String[] args) {

        // Car car = new Car(); // this should not compile.

        // Car car = new Dacia(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create a Dacia car, I will need to create an instance of a Dacia model.

        FordFocus car1 = new FordFocus();

        System.out.println(car1);

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
