package assignments.WeeklyQuiz.Week2;

public class Grocery extends Product implements DeliveryChargeCalculator {

    Grocery(String name, double weight, int price) {
        super(name, weight, price);
    }


    public String getName() {
        return name;
    }
    @Override
    public int getTotalPrice() {
        return getDeliveryCharge(weight, price);
    }

    @Override
    public int getDeliveryCharge(double weight, int price) {
        int deliveryPrice;

        if (weight < 3) {
            deliveryPrice = 1000;
        }
        else if (weight < 10) {
            deliveryPrice = 5000;
        }
        else {
            deliveryPrice = 10000;
        }
        return getDiscount(price, deliveryPrice);
    }

    private int getDiscount(int productPrice, int deliveryPrice) {
        int totalPrice;

        if (productPrice < 30000) {
            totalPrice = deliveryPrice;
        }
        else if (productPrice < 100000) {
            totalPrice = deliveryPrice - 1000;
        }
        else {
            totalPrice = 0;
        }
        return totalPrice;
    }
}