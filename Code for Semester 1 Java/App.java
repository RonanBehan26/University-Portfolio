/*
*App.java
*Homework - create and app and an instantiable class for figuring out savings
*30/09/19
*/
import java.util.Scanner;
public class App{
    public static void main(String args[]){
		//declare variables
		Double n1, n2, sum;

		//declare objects
		Scanner InstantiableClass;

		//create objects
		InstantiableClass = new Scanner(System.in);

		//input
		System.out.println("Please enter n1");
		n1 = InstantiableClass.nextDouble();
		System.out.println("Please enter n2");
		n2 = InstantiableClass.nextDouble();

		//process
		sum = n1 + n2;

		//output
		System.out.println("The sum of "+n1+" and "+n2+" is "+sum);

    }

}