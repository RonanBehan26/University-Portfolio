/*
*Title: TwentyFifty
*A: R.
*6/10
*/

import java.util.Scanner;
public class TwentyFiftyApp{
	public static void main (String args[]){
		//dec vars
		int x, y;

		//dec obs
		Scanner keyboard;
		TwentyFifty myTwentyFifty;

		//create obs
		keyboard = new Scanner(System.in);
		myTwentyFifty = new TwentyFifty();

		//input
				System.out.println("Please enter the year of your birth");
				x = keyboard.nextInt();
				myTwentyFifty.setX(x);

		//process
		myTwentyFifty.compute();

		//output
			y = myTwentyFifty.getY();
			System.out.println("You will be "+y+" in 2050.");

	}
}
