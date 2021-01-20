//HW W4 Ex 1 Ins 2 - - all good
public class Rec{
	//declare vars
	private int recHeight;
	private int recWidth;
	private int recArea;

	//set methods
	public void setRectangleHeight(int recHeight){
		this.recHeight=recHeight;
	}

	public void setRectangleWidth(int recWidth){
			this.recWidth=recWidth;
	}

	//process/compute
	public void computerecArea(){
		recArea=recHeight*recWidth;
	}

	//get
	public int getrecArea(){
		return recArea;
	}
}