/*
*Title: Savings
*Author: Ronan
*Date: 06/10
*/

public class Savings{
	//data members
	private int x;
	private int y;

	//constructor
	public Savings(){
		x = 0;
		y = 0;

	}

	//set method
	public void setX(int x){
		this.x= x;
	}

	//compute
	public void compute(){
		y = x*10;

	}

	//get method - one for every output
	public int getY(){
		return y;
	}
}
