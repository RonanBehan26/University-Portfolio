public class Eggs{
	//vars
	private int eggs;
	private int boxes;
	private int remainderEggs;
	private double cost;
	//constructors
	//set
	public void setEggs(int eggs){
		this.eggs=eggs;
	}
	//compute*
	public void computeBoxes(){
		boxes=eggs/6;
	}

	public void computeRemainderEggs(){
		remainderEggs=eggs%6;
	}

	public void computeCost(){
			cost=boxes*0.99;
	}

	//get
	public int getBoxes(){
		return boxes;
	}

	public int getRemainderEggs(){
		return remainderEggs;
	}

	public double getCost(){
		return cost;
	}

}