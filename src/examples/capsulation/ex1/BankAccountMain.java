package examples.capsulation.ex1;

public class BankAccountMain {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount();

        bankAccount.deposit(50000);
        bankAccount.withdraw(60000);
        int total = bankAccount.getBalance();
        System.out.println("소지 금액: " + total);
    }
}
