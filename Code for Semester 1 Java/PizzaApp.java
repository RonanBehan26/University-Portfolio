import java.util.Scanner;
public class PizzaApp{
	public static void main(String[] args){
		//vars
		String size;
		double basePrice;
		double totalToppingPrice;
		int numToppings;
		//objects
		Scanner scan;
		scan=new Scanner(System.in);
		PizzaSize ps;
		ps=new PizzaSize();
		PizzaToppings pt;
		pt=new PizzaToppings();
		//input
		System.out.println("Welcome to Sam's Pizza");
		System.out.println("Enter M for medium, L for Large");
		size=scan.next();
		System.out.println("Enter num of toppings");
		numToppings=scan.nextInt();
		//set
		ps.setSize(size);
		//compute
		ps.computeBasePrice();
		//get
		basePrice=ps.getBasePrice();
		//output
		System.out.println("Cost:"+basePrice);
	}
}