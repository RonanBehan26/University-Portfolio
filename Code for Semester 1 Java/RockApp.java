import java.util.Scanner;
public class RockApp{
	public static void main(String args[]){
		//vars
		int choice;
		int computer;
		String msg;
		//dec/cre obj
		Rock r;
		r=new Rock();
		Scanner scan=new Scanner(System.in);
		//initialize
		System.out.println("Enter 1 for Rock, 2 for Paper and 3 for Scissors");
			choice=scan.nextInt();
		//set
		r.setChoice(choice);
		//comp
		r.gameLogic();
		//get
		msg=r.getMsg();
		//output
		System.out.println(msg);
	}
}