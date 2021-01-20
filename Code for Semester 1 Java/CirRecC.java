public class CirRecC{
	//vars
	private double radius;
	private double areaC; //circ area
	//const
	//set
	public void setRadius(double radius){
		this.radius=radius;
	}
	//compute
	public void computeAreaC(){
		areaC=3.14*(radius*radius);
	}
	//get
	public double getAreaC(){
		return areaC;
	}
}