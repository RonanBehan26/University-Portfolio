import java.io.Serializable;
//this implements serializable, is all you need to do this
public class BankAccount implements Serializable { //this makes it serializable(implements Serializable) to write in a file

    long number;
    double amount;

    public BankAccount(long number, double amount) { //you must instantiate bank account
        this.number = number;
        this.amount = amount;
    }

    public long getNumber() {

        return this.number;
    }

    public double getAmount() {

        return this.amount;
    }

    public void setAmount(double amount) {

        this.amount = amount;
    }
}
