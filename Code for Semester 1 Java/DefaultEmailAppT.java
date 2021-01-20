import java.util.Scanner;
public class DefaultEmailAppT{
	public static void main(String args[]){
		//vars
		String fName;
		String lName;
		String email;
		int x;
		//dec cre obj
		DefaultEmailT t=new DefaultEmailT();
		Scanner scan=new Scanner(System.in);
		//inst
		System.out.println("fn");
		fName=scan.next();
		System.out.println("ln");
		lName=scan.next();
		do{
		System.out.println("no.");
		x=scan.nextInt();
		}while(x>fName.length() || x<=0);
		//set
		t.setFName(fName);
		t.setLName(lName);
		t.setX(x);
		//compu
		t.computeEmail();
		//get
		email=t.getEmail();
		//output
		System.out.println(email);
	}
}