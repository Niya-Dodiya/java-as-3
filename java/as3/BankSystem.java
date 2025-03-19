//package as3;
/*abstract class methos overriding */
abstract class BankAccount {
    protected int accountNumber;
    public String accountHolderName;
    protected double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    abstract void withdraw(double amount);

    void deposit(double amount) {
        balance += amount;
    }

    void displayAccountDetails() {
        System.out.println("account holder id:" +accountNumber+"  ,Account Holder name: " + accountHolderName + ", Balance: " + balance);
    }
    // abstract method
    // abstract void withdraw(double amount);
}

class SavingsAccount extends BankAccount {
    private double interestRate;

    public SavingsAccount(int accountNumber, String accountHolderName, double balance,double interestRate) {
        super(accountNumber, accountHolderName, balance);
        this.interestRate=interestRate;
    }

    void withdraw(double amount) {
        if (balance - amount >= 500) {
            balance -= amount;
        System.out.println("afther withdraw: "+balance);
        }
        else {
            System.out.println("Insufficient Balance");
        }
        }
}

public class BankSystem {
    public static void main(String[] args) {
        System.out.println("2199 :niya dodiya");
        SavingsAccount acc = new SavingsAccount(12345, "John Doe", 2000,5);
        acc.displayAccountDetails();
        acc.withdraw(500);
    }
}