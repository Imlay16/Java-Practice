package examples.staticex.Car;

public class Car {
    public static int number = 0;

    Car() {
        number++;
    }
    public static int ShowCarNumber() {
        return number;
    }
}
