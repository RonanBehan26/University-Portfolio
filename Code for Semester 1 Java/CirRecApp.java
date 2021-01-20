import java.util.Scanner;
public class CirRecApp{
	public static void main(String[] args){
		//vars
		double length;
		double height;
		double areaR; //rec area
		double radius;
		double areaC; //circ area
		//dec/cre obj
		CirRecR r;
		r= new CirRecR();
		CirRecC c;
		c=new CirRecC();
		Scanner scan=new Scanner(System.in);
		//initiaize
		System.out.println("Please enter the lenght of the rectangle");
		length=scan.nextDouble();

		System.out.println("Please enter the height of the rectangle");
		height=scan.nextDouble();

		System.out.println("Please enter the radius of the circle");
		radius=scan.nextDouble();

		//set
		r.setLength(length);
		r.setHeight(height);
		c.setRadius(radius);
		//compute
		r.computeAreaR();
		c.computeAreaC();
		//get
		areaR=r.getAreaR();
		areaC=c.getAreaC();
		//output
		System.out.println("The area of your rectangle is "+areaR+" cm squared.");
		System.out.println("The area of your circle is "+areaC+" cm squared.");
	}
}