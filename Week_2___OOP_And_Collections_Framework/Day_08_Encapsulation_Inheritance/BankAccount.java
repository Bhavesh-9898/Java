// Build a `BankAccount` class with encapsulation

public class BankAccount {

    private String accountHolder;
    private double balance;

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance");
        }
    }

    public static void main(String[] args) {
        BankAccount acc = new BankAccount();
        acc.setAccountHolder("Bhavesh");
        acc.setBalance(5000);

        System.out.println(acc.getAccountHolder());
        System.out.println(acc.getBalance());
    }
}