import java.util.Scanner;
public class DefaultEmailApp{
	public static void main(String[] args){
		String fname="";
		String lname;
		int x;
		String newEmail;

		//objects
		DefaultEmail de;
		de=new DefaultEmail();
		Scanner scan;
		scan=new Scanner(System.in);
		//inputs
		System.out.println("Enter first name");
		fname=scan.next();
		System.out.println("Enter last name");
		lname=scan.next();
		do{
			System.out.println("Enter a number < or = to the length of your first name");
			x=scan.nextInt();
		}while(x>fname.length() || x<=0);
		//set
		de.setFName(fname);
		de.setLName(lname);
		de.setX(x);
		//compute
		de.computeNewEmail();
		//get
		newEmail=de.getNewEmail();
		//output
		System.out.println(newEmail);
	}




