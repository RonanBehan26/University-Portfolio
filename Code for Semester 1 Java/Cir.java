//HW W4 Ex 1 Ins 1 - - all good
public class Cir{
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