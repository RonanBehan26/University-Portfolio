import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.InputMismatchException;
import java.util.Scanner;

/*
Amend your program from Task 1,
so that what the user types into the console is saved to file.
 */

public class Task2 {
//exceptions are thrown up
    public static void main(String args[]) throws InputMismatchException,
            FileNotFoundException, IOException {
        Scanner keyboard = new Scanner(System.in);

        System.out.print("Employee name: ");
        String name = keyboard.nextLine();

        System.out.print("Employee address: ");
        String address = keyboard.nextLine();

        System.out.print("Employee ssn: ");
        int ssn = keyboard.nextInt();

        System.out.println("Employee " + name + " that lives at " + address
                + " whose SSN is " + ssn);

        Employee e = new Employee(name, address, ssn); //instantiate employee, passing info into emplyee object
        FileOutputStream fileOut = new FileOutputStream("employee.data");//opening a file
        ObjectOutputStream out = new ObjectOutputStream(fileOut);//put an object in the file
        out.writeObject(e);//what object? var e
        out.close();//close ouputobject
        fileOut.close();//close file
    }
}

//new class called employee, allows you to hold the info, constructor, no methods (could have gets and sets)
//note implements Serializable, it's needed, this is what is important here!
//Serializable Object
class Employee implements Serializable { //note that he has called this a class, because it's a fucking class

    String name;
    String address;
    int ssn;

    public Employee(String name, String address, int ssn) {
        this.name = name;
        this.address = address;
        this.ssn = ssn;
    }
}
