import java.util.Scanner;
public class AgeApp{
	public static void main(String[] args){
		//dec vars
		int age;
		String msg;
		//dec obj
		Scanner scan;
		scan=new Scanner(System.in);
		Age A;
		A=new Age();
		//input
		System.out.println("Enter your age");
		age=scan.nextInt();
		//set
		A.setAge(age);
		//compute
		A.computeMsg();
		//get
		msg=A.getMsg();
		//output
		System.out.println(msg);
	}
}

