import java.util.Scanner;

public class TemperatureApp {

    public static void main(String args[]){

		//declare variables
		double celsius;
		double fahrenheit;

		//declare objects
		Scanner keyboard;
		Temperature myTemperature;

		//create objects
		keyboard = new Scanner(System.in);
		myTemperature = new Temperature();

		//acceot input from user
		System.out.println("Enter temperature in Celsius >> ");
		celsius = keyboard.nextDouble();

		//set input
		myTemperature.setCelsius(celsius);

		//computation
		myTemperature.computeFahrenheit();

		//get answer
		fahrenheit=myTemperature.getFahrenheit();

		//output result to user
		System.out.println("This temp of celcius is "+fahrenheit+" in fahrenheit");


	}
}