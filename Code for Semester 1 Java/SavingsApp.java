/*
*Title: SavingsApp
*Name: R.
*Date: 6/10/19
*/

import java.util.Scanner;
public class SavingsApp{
	public static void main (String args[]){
		//declare variables
		int x, y;

		//declare objects
		Scanner keyboard;
		Savings mySavings;

		//create objects
		keyboard = new Scanner(System.in);
		mySavings = new Savings();

		//input
		System.out.println("Please enter yearly earnings");
		x = keyboard.nextInt();
		mySavings.setX(x);

		//process
		mySavings.compute();

		//output
		y = mySavings.getY();
		System.out.println("Savings after ten years are "+y);
	}
}