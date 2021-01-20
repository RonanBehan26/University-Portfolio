public class Radius{
	//declare vars
	private double radius;
	private double answer;

	//set methods
	public void setRadius(double radius){
		this.radius=radius;
	}

	//process/compute
	public void computeanswer(){
		answer=3.14*(radius*radius);
	}

	//get
	public double getanswer(){
		return answer;
	}
}