package assignments.WeeklyQuiz.Week2;

public abstract class Product {
    String name;
    double weight;
    int price;
    Product(String name, double weight, int price) {
        this.name = name;
        this.weight = weight;
        this.price = price;
    }

    public abstract String getName();
    public abstract int getTotalPrice();

}
