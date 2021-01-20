import java.util.Scanner;
public class AgeApp{
	public static void main(String args[]){
	//vars
	int age;
	String result;
	//dec/cre obj
	Age a;
	a=new Age();
	Scanner scan=new Scanner(System.in);
	//instantiate
	System.out.println("Enter your age");
		age=scan.nextInt();
	//set
	a.setAge(age);
	//compute
	a.computeResult();
	//get
	result=a.getResult();
	//output
	System.out.println(result);

	}
}