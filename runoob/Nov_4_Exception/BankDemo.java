package Nov_4_Exception;

public class BankDemo {
    public static void main(String [] args) {
        CheckingAccount test = new CheckingAccount(101);
        System.out.println("Despositing $5000...");
        test.deposit(5000);
        try {
            System.out.println("\nWithdrawing $100...");
            test.withdraw(10000);
        } catch (InsufficientFundsException ex) {
            System.out.println("Sorry" + ex.getAmount());
            ex.printStackTrace();
        }
    }
}
