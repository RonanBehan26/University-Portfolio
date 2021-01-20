/*
*Measure.java
@Author: R.
*6/10/19
*/

import java.util.Scanner;
public class MeasureApp{
	public static void main (String args[]){
		//declare variables
		int m, cm;

		//declare objects
		Scanner keyboard;
		Measure myMeasure;

		//create objects
		keyboard = new Scanner(System.in);
		myMeasure = new Measure();

		//input
		System.out.println("Please enter a number of metres");
		m = keyboard.nextInt();
		myMeasure.setM(m);

		//process
		myMeasure.compute();

		//output
		cm = myMeasure.getCm();
		System.out.println("The total number of cm is "+cm);
	}
}

