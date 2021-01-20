import java.util.Scanner;
public class PiApp{
	public static void main(String[] args){
		//vars
		double totalToppingPrice;
		String size; //
		double pizzaPrice;
		int basePrice;
		double grandTotal;
		int numToppings; //
		int numPizzas; //
		//dec cre obj
		Pi j;
		j=new Pi();
		PiT t;
		t=new PiT();
		Scanner scan=new Scanner(System.in);
		//input
		System.out.println("Welcome to Stagats!");
		System.out.println("How many Pizzas you want?");
			numPizzas=scan.nextInt();
		//initialize
		for(int i=0; i<numPizzas; i++){
			System.out.println("L for Large, M for Medium.");
				size=scan.next();

			System.out.println("how many topics?");
				numToppings=scan.nextInt();

			//set
			j.setSize(size);
			t.setSize(size);
			t.setNumToppings(numToppings);
			//com
			t.computeTotalToppingPrice();
			j.computeBasePrice();
			//get
			totalToppingPrice=t.getTotalToppingPrice();
			basePrice=j.getBasePrice();
			pizzaPrice=totalToppingPrice+basePrice;
			grandTotal=pizzaPrice*numPizzas;
			//out
			System.out.println("Cost of Pizza = "+pizzaPrice);
			System.out.println("Total Cost= "+grandTotal);

		}
	}
}