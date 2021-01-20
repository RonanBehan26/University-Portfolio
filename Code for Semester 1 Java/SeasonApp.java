import java.util.Scanner;
public class SeasonApp{
	public static void main(String[] args){
		//dec vars
		int month;
		String msg;
		//dec objs
		Scanner scan;
		scan=new Scanner(System.in);
		Season m;
		m=new Season();
		//inputs
		System.out.println("Enter a number representing a month");
		month=scan.nextInt();
		//set
		m.setSeason(month);
		//compute
		m.computeMsg();
		//get
		msg=m.getMsg();
		//output
		System.out.println(msg);
	}
}
