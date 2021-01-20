import java.util.Scanner;
public class RockApp{
	public static void main(String[] args){
		//declare vars
		int hand;
		int computerGuess;
		String answer;
		//declare objects
		Rock r;
		r=new Rock();
		Scanner scan;
		scan=new Scanner(System.in);
		//inputs
		System.out.println("Enter the number of the hand you want to use. 1 for Rock, 2 for Paper ad 3 for Scissors.");
		hand=scan.nextInt();

		//set
		r.setHand(hand);

		//compute
		r.gameLogic();

		//get
		answer=r.getAnswer();

		//output
		System.out.println(answer);
	}
}