import java.util.Scanner;
public class GuessApp{
	public static void main(String args[]){
		//vars
		int secret;
		int guess;
		String result;
		//dec/cre obj
		Guess g;
		g=new Guess();
		Scanner scan=new Scanner(System.in);
		//initialize/input
		System.out.println("Enter guess, 1 - 10");
			guess=scan.nextInt();
		//set
		g.setGuess(guess);
		//compute
		g.gameLogic();
		//get
		result=g.getResult();
		//output
		System.out.println(result);
	}
}