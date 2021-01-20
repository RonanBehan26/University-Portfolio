public class Clothes{
	//dec vars
	private int hats;
	private int tshirts;
	private int hoodies;
	private double cost;

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
	public void computeCost(){
		cost=((hats*9.50)+(tshirts*15)+(hoodies*20));
	}

	//get
	public double getCost(){
		return cost;
	}
}
