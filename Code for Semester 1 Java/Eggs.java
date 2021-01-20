public class Eggs{
	//declare vars
	private int eggs;
	private int numBoxes;
	private int leftover;
	private double totalCost;
	//alternative: private double boxPrice=.99;
	//set methods
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	//process/compute
	public void computeNumBoxes(){
		numBoxes=eggs/6;
	}
	public void computeTotalCost(){
		totalCost=numBoxes*.99;
	}
	public void computeLeftover(){
		leftover=eggs%6;
	}
	//get
	public int getNumBoxes(){
		return numBoxes;
	}
	public int getLeftover(){
		return leftover;
	}
	public double getTotalCost(){
		return totalCost;
	}
}