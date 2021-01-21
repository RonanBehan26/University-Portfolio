import java.io.FileInputStream;
import java.io.ObjectInputStream;
//now we want to read it, reads file bankAccount.ser
public class DeserializeBankAccount {

    public static void main(String[] args) throws Exception {
        FileInputStream fileIn = new FileInputStream("bankAccount.ser"); //reads file bankAccount.ser
        ObjectInputStream in = new ObjectInputStream(fileIn);
        BankAccount e = (BankAccount) in.readObject(); //reads the object and casts it into a bank account
        in.close();
        fileIn.close();

        System.out.println("Deserialized Bank Account...");
        System.out.println("Name: " + e.getNumber());
        System.out.println("Address: " + e.getAmount());
    }
}
