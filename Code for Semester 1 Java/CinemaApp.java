import java.util.Scanner;
public class CinemaApp{
	public static void main(String args[]){
		//vars
		int age;
		String msg;
		//de/cre obj
		Cinema c;
		c=new Cinema();
		Scanner scan=new Scanner(System.in);
		//initiaize
		System.out.println("Enter age sweetcheeks");
			age=scan.nextInt();
		//set
		c.setAge(age);
		//comput
		c.computeMsg();
		//get
		msg=c.getMsg();
		//input
		System.out.println(msg);

	}
}