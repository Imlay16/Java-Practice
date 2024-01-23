package examples.capsulation.ex3;

public class ShoppingCart {

    private Item[] items;
    private int count = 0;
    public ShoppingCart() {
        items = new Item[10];
    }
    public void addItem(Item item) {

        if (count >= items.length) {
            System.out.println("장바구니 초과");
            return;
        }

        items[count++] = item;
    }

    public void displayItems() {
        System.out.println("장바구니 상품 출력");
        for (int i = 0; i < count; i++) {
            System.out.println("상품명: " + items[i].getName() + ", 합계: " + items[i].getTotalPrice());
        }
        System.out.println("전체 가격 합: " + calculateTotalPrice());
    }

    private int calculateTotalPrice() {
        Item item;
        int totalPrice = 0;
        for (int i = 0; i < count; i++) {
            item = items[i];
            totalPrice += item.getTotalPrice();
        }
        return totalPrice;
    }
}
