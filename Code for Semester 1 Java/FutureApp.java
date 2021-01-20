import java.util.Scanner;
public class FutureApp{
	public static void main(String[] args){
		//vars
		int age;
		int birthYear;
		//dec/cre objects
		Future f;
		f=new Future();
		Scanner scan;
		scan=new Scanner(System.in);
		//initialize/input
		System.out.println("Please enter your birth year");
			birthYear=scan.nextInt();
		//set
		f.setBirthYear(birthYear);
		//compute
		f.computeAge();
		//get
		age=f.getAge();
		//output
		System.out.println("The age you will be in 2050 is "+age+" years young ;)");
	}
}