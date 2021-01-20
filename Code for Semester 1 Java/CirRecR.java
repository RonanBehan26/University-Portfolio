public class CirRecR{
	//vars
	private double length;
	private double height;
	private double areaR;
	//const
	//set
	public void setLength(double length){
		this.length=length;
	}

	public void setHeight(double height){
		this.height=height;
	}
	//compute
	public void computeAreaR(){
		areaR=length*height;
	}
	//get
	public double getAreaR(){
		return areaR;
	}
}