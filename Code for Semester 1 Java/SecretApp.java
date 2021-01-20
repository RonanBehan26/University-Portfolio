//Q2 pt 1 - all good
import java.util.Scanner;
public class SecretApp{
	public static void main(String[] args){
		//declare vars
		int x;

		//dec obj
		Scanner scan;
		scan=new Scanner(System.in);

		//input
		System.out.println("Enter secret number");
		x=scan.nextInt();

		//process
		if(x > 7){
			System.out.println("Too High");
		}
		else if(x <7){
			System.out.println("Too low bud.");
		}
		else if (x == 7){
			System.out.println("got it");
		}

	}

}



