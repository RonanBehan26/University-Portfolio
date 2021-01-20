import java.util.Scanner;
public class CinemaApp{
	public static void main(String[] args){
		//dec vars
		int age;
		String msg;
		//dec obj
		Scanner scan;
		scan=new Scanner(System.in);
		Cinema A;
		A=new Cinema();
		//input
		System.out.println("Enter your age");
		age=scan.nextInt();
		//set
		A.setCinema(age);
		//compute
		A.computeMsg();
		//get
		msg=A.getMsg();
		//output
		System.out.println(msg);
	}
}