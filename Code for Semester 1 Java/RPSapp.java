import java.util.Random;
import java.util.Scanner;
public class RPSapp{
	public static void main(String[] args){
		//variables
		int userChoice, computerChoice;
		String msg;
		boolean win=false;
		//declare objects
		RPS r=new RPS();
		Scanner scan=new Scanner(System.in);
		Random rn=new Random();

		while(win==false){
			//inputs
			System.out.print("Enter your choice of Rock(1), Paper(2) or Scissors(3): ");
			userChoice=scan.nextInt();
			computerChoice = rn.nextInt(3-1+1)+1;
			System.out.println(computerChoice);//for testing
			//set
			r.setComputerChoice(computerChoice);
			r.setUserChoice(userChoice);
			//compute
			r.computeMsg();
			//get
			msg=r.getMsg();
			win=r.getWin();
			//output
			System.out.println(msg);
		}
	}
}