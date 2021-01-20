public class PizzaT{
	//vars
	private String size;
	private double rate;
	private int numToppings;
	private double baseToppingsPrice=.5;
	private double totalToppingPrice; //this is the result we want

	//constr
	//set
	public void setSize(String size){
		this.size=size;
	}

	public void setNumToppings(int numToppings){
		this.numToppings=numToppings;
	}
	//compute
	public void computeTotalToppingPrice(){
		if(size.equalsIgnoreCase("L")){
			rate=1.5;
		}
		else if(size.equalsIgnoreCase("M")){
			rate=1.0;
		}

		totalToppingPrice=numToppings*(rate*baseToppingsPrice);
	}
	//get
	public double getTotalToppingPrice(){
		return totalToppingPrice;
	}
}