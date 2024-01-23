package examples.staticex.Car;

public class StaticMain {
    public static void main(String[] args) {

        Car K3 = new Car();
        Car Tesla = new Car();
        Car Avante = new Car();

        int total = Car.ShowCarNumber();
        System.out.println(total);
    }
}
