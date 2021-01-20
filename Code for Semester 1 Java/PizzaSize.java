public class PizzaSize{
	//dec vars
	private String size;
	private double basePrice;
	//set
	public void setSize(String size){
		this.size=size;
	}
	//compute
	public void computeBasePrice(){
		if(size.equalsIgnoreCase("L")){
			basePrice=15;
		}
		else if(size.equalsIgnoreCase("M")){
			basePrice=10;
		}
		//get - double because double needs to reflect the return type
		public double getBasePrice(){
				return basePrice;
	}
}