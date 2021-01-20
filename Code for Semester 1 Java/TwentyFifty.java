/*
*Title: TwentyFifty
*A: R.
*6/10
*/

public class TwentyFifty{
	//data members
	int x;
	int y;

	//contructor
	public TwentyFifty(){
	x = 0;
	y = 0;

}

	//set method
	public void setX(int x){
		this.x= x;

	}

	public void setY(int y){
		this.y= y;

	}

	//compute
	public void compute(){
		y = 2050-x;
	}

	//get method
	public int getY(){
		return y;
	}
}



