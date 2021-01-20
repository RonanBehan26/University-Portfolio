import java.util.Scanner;
public class SecApp{
	public static void main(String args[]){
		//vars
		int secret;
		int guess;
		String ans;
		//dec/crea objects
		Sec s;
		s=new Sec();
		Scanner scan=new Scanner(System.in);
		//instantiate/input
		System.out.println("please enter your guess big guy, between one and 10!");
			guess=scan.nextInt();
		//set
		s.setGuess(guess);
		//compute
		s.gameLogic();
		//get
		ans=s.getAns();
		//output
		System.out.println(ans);


	}
}