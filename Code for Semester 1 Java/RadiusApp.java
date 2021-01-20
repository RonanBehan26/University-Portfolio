import java.util.Scanner;
public class RadiusApp{
	public static void main(String[] args){
		//declare vars
		double radius;
	    double answer;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Radius A;
		A=new Radius();
		//inputs
		System.out.println("Enter the Radius:");
		radius=scan.nextDouble();

		//set
		A.setRadius(radius);

		//compute
		A.computeanswer();

		//get
		answer=A.getanswer();

		//output
		System.out.println("The area of your Circle is: "+answer);


	}
}