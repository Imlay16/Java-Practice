package examples.capsulation.ex3;

public class ShoppingCartMain {

    public static void main(String[] args) {

        ShoppingCart shoppingCart = new ShoppingCart();

        Item item1 = new Item("마늘", 2000, 5);
        Item item2 = new Item("삼겹살", 15000, 3);

        shoppingCart.addItem(item1);
        shoppingCart.addItem(item2);

        shoppingCart.displayItems();
    }
}
