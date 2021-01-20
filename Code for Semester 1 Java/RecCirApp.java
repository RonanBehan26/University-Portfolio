//HW W4 Ex 1 App - - all good (Don't seperate next time, put vars with vars, objects with objects etc.)
import java.util.Scanner;
public class RecCirApp{
	public static void main(String[] args){
		//declare vars
		int recHeight;
		int recWidth;
		int recArea;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Rec H;
		H=new Rec();
		//inputs
		System.out.println("Enter height of Rectangle:");
		recHeight=scan.nextInt();

		System.out.println("Enter width of Rectangle:");
		recWidth=scan.nextInt();
		//set
		H.setRectangleHeight(recHeight);
		H.setRectangleWidth(recWidth);
		//compute
		H.computerecArea();

		//get
		recArea=H.getrecArea();

		//output
		System.out.println("The area of your Rectangle is: "+recArea);


		//declare vars
		double radius;
	    double answer;
		//declare objects

		Cir A;
		A=new Cir();
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