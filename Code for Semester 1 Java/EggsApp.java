import java.util.Scanner;
public class EggsApp{
	public static void main(String[] args){
		//vars
		int eggs;
		int boxes;
		int remainderEggs;
		double cost;
		//dec/creat objects
		Eggs e;
		e = new Eggs();
		Scanner scan=new Scanner(System.in);
		//initialise/input
		System.out.println("Enter your no. of eggs please.");
		eggs=scan.nextInt();
		//set
		e.setEggs(eggs);
		//compute
		e.computeBoxes();
		e.computeRemainderEggs();
		e.computeCost();
		//get
		boxes=e.getBoxes();
		remainderEggs=e.getRemainderEggs();
		cost=e.getCost();
		//output
		System.out.println("The no. of boxes you need is "+boxes);
		System.out.println("You will have "+remainderEggs+" eggs left over");
		System.out.println("The total cost of these boxes will be "+cost+" euros.");
	}
}