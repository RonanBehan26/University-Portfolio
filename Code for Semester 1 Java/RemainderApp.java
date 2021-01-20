/*
* Title: RemainderApp
* Name: Ronan
* Date: 06/10
*/

import java.util.Scanner;
public class RemainderApp{
	public static void main (String args[]){
		//declare variables
		int x, y, a, b, c;

		//declare objects
		Scanner keyboard;
		Remainder myRemainder;

		//create objects
		keyboard = new Scanner(System.in);
		myRemainder = new Remainder();

		//input
		System.out.println("Please enter monthly earnings");
		x = keyboard.nextInt();
		myRemainder.setX(x);

		System.out.println("Please enter monthly expenses");
				y = keyboard.nextInt();
		myRemainder.setY(y);

		//process
		myRemainder.compute();

		//output
		a = myRemainder.getA();
		System.out.println("Your savings will be "+a+ " after a month");

		b = myRemainder.getB();
		System.out.println("Your savings will be "+b+ " after a year");

		c = myRemainder.getC();
		System.out.println("Your savings will be "+c+ " after 10 years");

	}
}




