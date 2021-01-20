public class Pizza{
	//vars
	private String size;
	private int basePrice;
	//constr
	//set
	public void setSize(String size){
		this.size=size;
	}
	//comput
	public void computeSize(){
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