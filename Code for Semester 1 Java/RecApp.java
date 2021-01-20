import java.util.Scanner;
public class RecApp{
	public static void main(String[] args){
		//vars
		double heiGht;
		double lenGth;
		double arEa;
		//de/cre obj
		Rec r;
		r=new Rec();
		Scanner scan=new Scanner(System.in);
		//initialize/input
		System.out.println("Please enter the height of the Rectangle in cm");
			heiGht=scan.nextDouble();

		System.out.println("Please enter the length of the Rectangle in cm");
			lenGth=scan.nextDouble();
		//set
		r.setHeiGht(heiGht);
		r.setLenGth(lenGth);
		//compute
		r.computeArEa();
		//get
		arEa=r.getArEa();
		//output
		System.out.println("The area of your rectangle is "+arEa+" cm squared.");
	}
}