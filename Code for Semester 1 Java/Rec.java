public class Rec{
	//dec vars
	private double lenGth;
	private double heiGht;
	private double arEa;
	//constructors
	//set
	public void setLenGth(double lenGth){
		this.lenGth=lenGth;
	}

	public void setHeiGht(double heiGht){
		this.heiGht=heiGht;
	}

	//compute*
	public void computeArEa(){
		arEa=(lenGth*heiGht);
	}
	//get
	public double getArEa(){
		return arEa;
	}

}