import java.util.Scanner;
public class LoanApp{
	public static void main(String[] args){
		//vars
		double money;
		double months;
		double interest;
		double total;
		//dec/cre obj
		Loan l;
		l=new Loan();
		Scanner scan=new Scanner(System.in);
		//initialize/input
		System.out.println("Please enter the amount of money you borrowed");
		money=scan.nextDouble();

		System.out.println("Please enter the number months you borrowed the money for");
		months=scan.nextDouble();
		//set
		l.setMoney(money);
		l.setMonths(months);
		//compute
		l.computeInterest();
		l.computTotal();
		//get
		interest=l.getInterest();
		total=l.getTotal();
		//output
		System.out.println("The amount of interest owed is "+interest+" euros");
		System.out.println("The total amount that you owe back, interest plus original sum is; "+total+" euros.");

	}
}