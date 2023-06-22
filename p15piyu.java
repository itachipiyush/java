/*
Write a program declaring a Java class called SavingsAccount with members ``accountNumber`` and ``Balance``.
Provide member functions as ``depositAmount ()`` and ``withdrawAmount ()``.
If user tries to withdraw an amount greater than their balance then throw a user-defined exception
 */
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class SavingsAccount {
    private int accountNumber;
    private double balance;

    public SavingsAccount(int accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void depositAmount(double amount) {
        balance += amount;
        System.out.println("Amount deposited successfully. New balance: " + balance);
    }

    public void withdrawAmount(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance. Cannot withdraw " + amount);
        }

        balance -= amount;
        System.out.println("Amount withdrawn successfully. New balance: " + balance);
    }
}

public class p15piyu {
    public static void main(String[] args) {
        SavingsAccount account = new SavingsAccount(123456, 1000.0);

        try {
            account.depositAmount(500.0);
            account.withdrawAmount(200.0);
            account.withdrawAmount(1500.0);
        } catch (InsufficientBalanceException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
