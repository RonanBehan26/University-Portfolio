import java.util.Scanner;
public class RockTwoApp{
	public static void main(String[] args){
		//declare vars
		int hand;
		int Rock;
		int Paper;
		int Scissors;
		int computerGuess;
		String answer;
		//declare objects
		RockTwo r;
		r=new RockTwo();
		Scanner scan;
		scan=new Scanner(System.in);
		//inputs
		System.out.println("Enter the word of the hand you want to use. Type Rock, Paper or Scissors.");
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