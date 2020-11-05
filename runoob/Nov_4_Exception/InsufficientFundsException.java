package Nov_4_Exception;
// import java.io.*;
public class InsufficientFundsException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    // amount 用来保存存储出现异常时所缺乏的钱
    private double amount;
    public InsufficientFundsException(double amount) {
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
