public class Clothes{
	//vars
	private int hats;
	private int tshirts;
	private int hoodies;
	private double hatCost;
	private double tshirtCost;
	private double hoodieCost;
	private double totalCost;
	//constuctors
	//set
	public void setHats(int hats){
		this.hats=hats;
	}

	public void setTshirts(int tshirts){
		this.tshirts=tshirts;
	}

	public void setHoodies(int hoodies){
		this.hoodies=hoodies;
	}
	//compute
	public void computeHatCost(){
		hatCost=hats*9.50;
	}

	public void computeTshirtCost(){
		tshirtCost=tshirts*15.00;
	}

	public void computeHoodieCost(){
		hoodieCost=hoodies*20;
	}

	public void computeTotalCost(){
		totalCost=hatCost+tshirtCost+hoodieCost;
	}

	//get
	public double getHatCost(){
		return hatCost;
	}

	public double getTshirtCost(){
		return tshirtCost;
	}

	public double getHoodieCost(){
		return hoodieCost;
	}

	public double getTotalCost(){
		return totalCost;
	}
}