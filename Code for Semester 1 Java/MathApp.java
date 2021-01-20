import java.util.Scanner; //1st part of scanner
public class MathApp{
	public static void main(String[] args){ //this is only in the app class
//dec vars
	int savings;
	int years;
	int ans;
//dec/create objects
	Math m; // no equals sign here
	m=new Math();
	Scanner scan=new Scanner(System.in); //2nd part of scanner, declaring and creating

//initialise/input - this is where you declare the values, either I set them or allow the user to set them here
// 3rd instance of scanner (scan) where I actually want to use the scanner
	System.out.println("Please enter the amount you save per year");
	savings=scan.nextInt();

	System.out.println("Now enter the number of years you have been saving for");
	years=scan.nextInt();

//set
	m.setSavings(savings); //this savings here is the value in the initialise above
	m.setYears(years);
//compute
	m.computeAns(); //don't put ans in the bracket as we aren't giving it the answer
//get
	ans=m.getAns();
//output
	System.out.println("Your savings for "+years+ " years are "+ans);
	}
}