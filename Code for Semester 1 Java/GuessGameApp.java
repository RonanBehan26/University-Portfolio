import java.util.Scanner;
import java.util.Random;
public class GuessGameApp{
	public static void main(String[] args){
		//vars
		int guess, cGuess;
		String msg;
		String flag="y";
		//dec cre ob
		GuessGame g=new GuessGame();
		Random rn=new Random(1);
		Scanner scan=new Scanner(System.in);
		//initialize
		for(int i=1; i<=3; i++){
			System.out.println("Enter your guess");
			guess=scan.nextInt();
			cGuess=rn.nextInt();
			System.out.println(cGuess);
		//set
		g.setGuess(guess);
		g.setCGuess(cGuess);
		//comp
		g.computeMsg();
		//get
		msg=g.getMsg();
		//output
		System.out.println(msg);
		System.out.println("Again?");
		flag=scan.next();

		}
	}
}