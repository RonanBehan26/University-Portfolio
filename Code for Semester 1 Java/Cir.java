public class Cir{
	//vars
	private double raD;
	private double arEa;
	//const
	//set
	public void setRaD(double raD){
		this.raD=raD;
	}
	//compute*
	public void computeArEa(){
		arEa=3.14*(raD*raD);
	}

	//get
	public double getArEa(){
		return arEa;
	}
}