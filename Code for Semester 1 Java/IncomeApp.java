import java.util.Scanner;
public class IncomeApp{
	public static void main (String[] Args){

		//dec vars
		int income;
		int expenditure;
		int ansOne;
		int ansTwo;
		int ansThree;

		//dec objects
		Scanner scan;
		scan = new Scanner(System.in);
		Income M;
		M=new Income();

		//input
		System.out.println("Please enter your monthly income.");
		income = scan.nextInt();

		System.out.println("Please enter your monthly expenditure.");
		expenditure = scan.nextInt();

		//set
		M.setIncome(income);
		M.setExpenditure(expenditure);

		//process
		M.computeAnsOne(ansOne);
		M.computeAnsTwo(ansTwo);
		M.computeAnsThree(ansThree);

		//get
		ansOne=M.getAnsOne();
		ansTwo=M.getAnsTwo();
		ansThree=M.getAnsThree();

		//output
		System.out.println("The total savings after 1 months has been "+ansOne);
		System.out.println("The total savings after 12 months has been "+ansTwo);
		System.out.println("The total savings after 10 years has been "+ansThree);
	}
}