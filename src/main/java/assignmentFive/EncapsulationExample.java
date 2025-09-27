package assignmentFive;

class BankAccount {
    // private fields (secure)
    private String accountHolder;
    private double balance;

    // constructor
    BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // write (setter)
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    // read (getter)
    public double getBalance() {
        return balance;
    }

    // security check: withdraw with condition
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Invalid withdrawal attempt!");
        }
    }
}

public class EncapsulationExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("Anik", 5000);

        account.deposit(2000);
        account.withdraw(1000);
        System.out.println("Final Balance: " + account.getBalance());
    }
}
