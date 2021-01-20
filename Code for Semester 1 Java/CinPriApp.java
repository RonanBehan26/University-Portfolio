import java.util.Scanner;
	public class CinPriApp{
		public static void main(String[] args){

			//dec vars
			int age;
			int day;
			double cost;

			//dec obj
			Scanner scan;
			scan=new Scanner(System.in);
			CinPri A;
			A=new CinPri();

			//input
			System.out.println("Enter your age");
				age=scan.nextInt();

			System.out.println("Enter the day of the week.");
				day=scan.nextInt();

			//set
			A.setCinPri(age);
			A.setCinPriTwo(day);

			//compute
			A.computeCost();

			//get
			cost=A.getCost();

			//output
			System.out.println("The total cost of your tick here today will come to "+cost+" euros");
		}
	}



