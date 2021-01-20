public class Mod{
	//vars
	private double modOne;
	private double modTwo;
	private double modThree;
	private double modFour;
	private double modFive;
	private double average;
	//constructors
	//set
	public void setModOne(double modOne){
		this.modOne=modOne;
	}

	public void setModTwo(double modTwo){
		this.modTwo=modTwo;
	}

	public void setModThree(double modThree){
		this.modThree=modThree;
	}

	public void setModFour(double modFour){
		this.modFour=modFour;
	}

	public void setModFive(double modFive){
		this.modFive=modFive;
	}

	//compute
	public void computeAverage(){
		average=(modOne+modTwo+modThree+modFour+modFive)/5;
	}
	//get
	public double getAverage(){
		return average;
	}

}