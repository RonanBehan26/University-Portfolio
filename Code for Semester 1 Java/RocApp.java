import java.util.Scanner;
public class RocApp{
	public static void main(String args[]){
		//vars
		String choice;
		int computer;
		String msg;
		//dec/cre obj
		Roc r;
		r=new Roc();
		Scanner scan=new Scanner(System.in);
		//initialize
		System.out.println("Enter either Rock,Paper or Scissors");
			choice=scan.nextLine();
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