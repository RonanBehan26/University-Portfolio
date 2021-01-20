//Q2 pt 2 - - not good
import java.util.Scanner;
public class SecRanApp{
	public static double random(String[] args){
		//declare vars
		double x=Math.random();

		//dec obj
		Scanner scan;
		scan=new Scanner(System.in);

		//input
		System.out.println("Enter secret number");
		x=scan.nextInt();

		//process
		if(x > Math.random()){
			System.out.println("Too High");
		}
		else if(x <Math.random()){
			System.out.println("Too low bud.");
		}
		else if (x == Math.random()){
			System.out.println("got it");
		}
}

