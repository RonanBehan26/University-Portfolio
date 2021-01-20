import java.util.Scanner;
public class PizzaApp{
	public static void main(String args[]){
	//vars
	int basePrice;
	String size;
	int numToppings;
	double totalToppingPrice;
	int numPizzas;
	double totalPrice;
	double grandTotal=0;
	//dec/cre obj
	Pizza p;
	p=new Pizza();
	PizzaT t;
	t=new PizzaT();
	Scanner scan=new Scanner(System.in);

	System.out.println("Welcome brother");
	System.out.println("How many Pizzas do you need?");
		numPizzas=scan.nextInt();
	//initialize
		for(int i=0; i<numPizzas; i++){
			System.out.println("Please enter L for large or M for medium");
				size=scan.next();

			System.out.println("Please enter the number of toppings you would like");
				numToppings=scan.nextInt();

			//set
			p.setSize(size);
			t.setSize(size);
			t.setNumToppings(numToppings);
			//comp
			p.computeSize();
			t.computeTotalToppingPrice();
			//get
			basePrice=p.getBasePrice();
			totalToppingPrice=t.getTotalToppingPrice();
			totalPrice=basePrice+totalToppingPrice;
			grandTotal=totalPrice*numPizzas;

			//output
			System.out.println("Here is the total cost of your pizza "+totalPrice);
			System.out.println("Here is the grand total "+grandTotal);
		}
	}
}