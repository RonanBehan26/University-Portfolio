import java.util.Scanner;
public class EggsApp{
	public static void main(String[] args){
		//declare vars
		int eggs;
		int numBoxes;
		int leftover;
		double totalCost;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Eggs e;
		e=new Eggs();
		//inputs
		System.out.println("Enter how many eggs:");
		eggs=scan.nextInt();
		//set
		e.setEggs(eggs);
		//compute
		e.computeNumBoxes();
		e.computeTotalCost();
		e.computeLeftover();
		//get
		numBoxes=e.getNumBoxes();
		leftover=e.getLeftover();
		totalCost=e.getTotalCost();
		//output
		System.out.println("Num boxes needed: "+numBoxes);
		System.out.println("Total cost: "+totalCost);
		System.out.println("Leftover eggs: "+leftover);

	}
}