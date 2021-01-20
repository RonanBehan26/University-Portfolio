public class Lap{
	//vars
	private int driverTime;
	private int numLaps;
	private int leftoverTime;
	private double trackRem; //remaining percentage of track
	//constructors
	//set
	public void setDriverTime(int driverTime){
		this.driverTime=driverTime;
	}
	//compute
	public void computeNumLaps(){
		numLaps=driverTime/180;
	}

	public void computeLeftoverTime(){
		leftoverTime=driverTime%180;
	}

	public void computeTrackRem(){
		trackRem=((180.00-leftoverTime)/180.00);
	}

	//get
	public int getNumLaps(){
		return numLaps;
	}

	public int getLeftoverTime(){
		return leftoverTime;
	}

	public double getTrackRem(){
		return trackRem;
	}
}