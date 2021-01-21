import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class SerializeBankAccount {

    public static void main(String[] args) throws Exception {
                                          //throws exception, can do IO exception but ou need to import it
        BankAccount e = new BankAccount(182943, 23009.87); //creates an object called bankaccount

        FileOutputStream fileOut = new FileOutputStream("bankAccount.ser"); //link(stream) to bankAccount.ser
        ObjectOutputStream out = new ObjectOutputStream(fileOut); //this makes the next object available, the line below
        out.writeObject(e); //e is the bank account
        out.close();//bank account file is created, closed

        fileOut.close();
        System.out.println("Serialized data is saved in \"bankAccount.ser\" file");
    }
}
