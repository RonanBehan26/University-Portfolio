//Extra Question Answered - - all good
import java.util.Scanner;
public class GradeApp{
	public static void main(String[] args){
		//declare vars
		int x;

		//dec obj
		Scanner scan;
		scan=new Scanner(System.in);

		//input
		System.out.println("Enter your University Grade");
		x=scan.nextInt();

		//process
		if(x >= 70){
			System.out.println("You got a 1.1!");
		}
		else if(x >= 60){
			System.out.println("2.1!");
		}
		else if (x >= 50){
			System.out.println("2.2!");
		}
		else if (x >= 40){
			System.out.println("Pass!");
		}
		else{
			System.out.println("Fail :(");
		}

	}

}