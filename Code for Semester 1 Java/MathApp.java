import java.util.Scanner;
public class MathApp{
	public static void main (String Args[]){
		//dec vars
		int save;
		int months;
		int ans;

		//dec objects
		Scanner keyboard;
		Math M;
		keyboard = new Scanner(System.in);
		M = new Math();

		//input
		System.out.println("Please enter the money you save per month.");
		save = keyboard.nextInt();

		System.out.println("Please enter the number of months you have been saving.");
		months = keyboard.nextInt();

		//set
		M.setSave(save);
		M.setMonths(months);

		//process
		M.computeAns();

		//get
		ans=M.getAns();

		//output
		System.out.println("The total saving after this number of months has been " +ans);
	}
}
