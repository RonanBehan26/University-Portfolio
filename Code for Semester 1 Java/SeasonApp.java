import java.util.Scanner;
public class SeasonApp{
	public static void main(String args[]){
		//vars
		int month;
		String msg;
		//de/cre obj
		Season s;
		s=new Season();
		Scanner scan=new Scanner(System.in);
		//initialize
		System.out.println("Enter 1 - 12, to get which season your month is in");
			month=scan.nextInt();
		//set
		s.setMonth(month);
		//compute
		s.computeMsg();
		//get
		msg=s.getMsg();
		//output
		System.out.println(msg);
	}
}