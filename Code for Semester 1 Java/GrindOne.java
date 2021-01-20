public class GrindOne{
	//declare vars
	private double[] mod= new double[5];
	private double average;
	//set
	public void setMod(double[] mod){
		this.mod=mod;
	}

	//compute
	public void computeAverage(){
		double sum = 0;
		for(int i=0; i<mod.length; i++){
			sum = sum + mod[i];
		}
		average = sum/5;
	}
	//get
	public double getAverage(){
		return average;
	}

}