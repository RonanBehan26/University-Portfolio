import java.util.Random;
import java.util.Scanner;
public class GuessingGameApp{
	public static void main(String[] args){
		//variables
		int userChoice, computerChoice;
		String msg;
		String flag="y";
		//declare objects
		GuessingGame r=new GuessingGame();
		Scanner scan=new Scanner(System.in);
		Random rn=new Random(1);
		for(int i = 0; i <= 100; i++){
			//inputs
			System.out.print("Enter your number: ");
			userChoice=scan.nextInt();
			computerChoice = rn.nextInt();
			System.out.println(computerChoice);
			//set
			r.setComputerChoice(computerChoice);
			r.setUserChoice(userChoice);
			//compute
			r.computeMsg();
			//get
			msg=r.getMsg();
			//output
			System.out.println(msg);
			System.out.println("Again?");
			flag=scan.next();
		}
	}
}