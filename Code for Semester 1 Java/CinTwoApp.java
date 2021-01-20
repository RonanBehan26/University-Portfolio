import java.util.Scanner;
public class CinTwoApp{
	public static void main(String args[]){
		//vars
		int age;
		int day;
		String msg;
		//de/cre obj
		CinTwo c;
		c=new CinTwo();
		Scanner scan=new Scanner(System.in);
		//initiaize
		System.out.println("Enter age sweetcheeks");
			age=scan.nextInt();

		System.out.println("Enter day ginger nuts");
			day=scan.nextInt();
		//set
		c.setAge(age);
		c.setDay(day);
		//comput
		c.computeMsg();
		//get
		msg=c.getMsg();
		//input
		System.out.println(msg);

	}
}