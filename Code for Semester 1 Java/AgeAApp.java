import java.util.Scanner;
public class AgeAApp{
	public static void main(String args[]){
		//vars
		int age;
		String result;
		//dec/cre ob
		Scanner scan=new Scanner(System.in);
		AgeA a=new AgeA();
		//initialize
		System.out.println("Age please");
		age=scan.nextInt();
		//set
		a.setAge(age);
		//compu
		a.computeResult();
		//get
		result=a.getResult();
		//out
		System.out.println(result);
	}
}