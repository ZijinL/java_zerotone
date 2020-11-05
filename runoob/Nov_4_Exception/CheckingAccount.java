package Nov_4_Exception;

public class CheckingAccount {
    private double balance;
    private int cardnum;

    public CheckingAccount(int num) {
        this.cardnum = num;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance) {
            balance -= amount;
        }
        else {
            double needs = amount - balance;
            throw new InsufficientFundsException(needs);
        }
    }

    public double getBalance() {
        return balance;
    }

    public int getNumber() {
        return cardnum;
    }
}
