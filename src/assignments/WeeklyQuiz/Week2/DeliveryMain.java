package assignments.WeeklyQuiz.Week2;

public class DeliveryMain {

    public static void main(String[] args) {

        Product beauty = new Beauty("화장품", 0.5, 25000);
        Product grocery = new Grocery("감자", 3, 30000);
        Product largeAppliance = new LargeAppliance("플스5", 2, 500000);

        Product[] products = {beauty, grocery, largeAppliance};

        for (Product product : products) {
            System.out.println(product.getName() + " total delivery price: " + product.getTotalPrice());
        }
    }
}
