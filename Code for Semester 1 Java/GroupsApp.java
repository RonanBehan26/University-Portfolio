import java.util.Scanner;
public class GroupsApp{
	public static void main(String[] args){
		//declare vars/initialise
			int birthYear;
			int ageAtTwentyFifty;


	 	//declare objects-link to instantiable
	 	Groups grp;
	 	grp=new Groups();
	 	Scanner scan;
	 	scan=new Scanner(System.in);
	 	//initialise
	 	System.out.println("Enter year of birth");
	 	birthYear=scan.nextInt();

	 	//set method
	 	grp.setbirthYear(birthYear);
	 	//compute/process
	 	grp.computeAgeAtTwentyFifty();

	 	//get
	 	ageAtTwentyFifty=grp.getAgeAtTwentyFifty();

	 	//output
	 	System.out.println("If you were born in "+birthYear+" then in 2050 you will be "+ageAtTwentyFifty);


	}
}