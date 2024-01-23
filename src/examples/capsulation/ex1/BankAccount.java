package examples.capsulation.ex1;

public class BankAccount {

    private int balance;

    // public 메서드
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
            System.out.println("현재 금액: " + balance);
        }
        else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            System.out.println("출금한 금액: " + amount);
            balance -= amount;
            System.out.println("현재 금액: " + balance);
        }
        else {
            System.out.println("유효하지 않은 금액이거나 잔액이 부족합니다.");
        }
    }

    public int getBalance() {
        return balance;
    }

    private boolean isAmountValid(int amount) {
        if (amount > 0) {
            return true;
        }
        else {
            return false;
        }
    }
}
