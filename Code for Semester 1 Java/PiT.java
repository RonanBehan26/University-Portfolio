public class PiT{
	//vars
	private String size;
	private int numToppings;
	private double rate;
	private double baseToppingPrice=0.5;
	private double totalToppingPrice;
	//const
	//set
	public void setSize(String size){
		this.size=size;
	}
	public void setNumToppings(int numToppings){
			this.numToppings=numToppings;
	}
	//comp
	public void computeTotalToppingPrice(){
		if(size.equalsIgnoreCase("L")){
			rate=1.5;
		}
		else if(size.equalsIgnoreCase("M")){
			rate=1.0;
		}


	totalToppingPrice=numToppings*(rate*baseToppingPrice);
	}
	//get
	public double getTotalToppingPrice(){
		return totalToppingPrice;
	}
}