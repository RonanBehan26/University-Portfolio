public class Pi{
	//vars
	private String size;
	private int basePrice;
	//const
	//set
	public void setSize(String size){
		this.size=size;
	}
	//comp
	public void computeBasePrice(){
		if(size.equalsIgnoreCase("L")){
			basePrice=15;
		}
		else if(size.equalsIgnoreCase("M")){
			basePrice=10;
		}
	}
	//get
	public int getBasePrice(){
		return basePrice;
	}
}