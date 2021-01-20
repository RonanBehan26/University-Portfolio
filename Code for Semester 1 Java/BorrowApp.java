import java.util.Scanner;
public class BorrowApp{
	public static void main(String[] args){
		//declare vars
		Double amount;
		int months;
		Double interest;
		Double answer;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Borrow A;
		A=new Borrow();
		//inputs
		System.out.println("Enter the amount you have borrowed:");
		amount=scan.nextDouble();

		System.out.println("Enter the amount of months you have borrowed for:");
		months=scan.nextInt();

		//set
		A.setBorrow(amount);
		A.setBorrow(months);

		//compute
		A.computeinterest();
		A.computeanswer();

		//get
		interst=A.getAnswer
		answer=A.getanswer();

		//output
		System.out.println("The amount you owe is: "+answer);


	}
}