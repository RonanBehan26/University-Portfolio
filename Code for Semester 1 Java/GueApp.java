import java.util.Scanner;
public class GueApp{
	public static void main(String args[]){
		//var
		int secret;
		int guess;
		String result;
		//dec/cre obj
		Gue g;
		g=new Gue();
		Scanner scan=new Scanner(System.in);
		//initialize-input
		System.out.println("Enter guess, 1 - 10");
			guess=scan.nextInt();
		//set
		g.setGuess(guess);
		//com
		g.gameLogic();
		//get
		result=g.getResult();
		//out
		System.out.println(result);
	}
}