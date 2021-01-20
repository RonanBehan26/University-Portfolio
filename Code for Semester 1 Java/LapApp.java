import java.util.Scanner;
public class LapApp{
	public static void main(String[] args){
		//vars
		int driverTime;
		int numLaps;
		int leftoverTime;
		double trackRem;
		//dec/cre objects
		Lap l;
		l=new Lap();
		Scanner scan=new Scanner(System.in);
		//initialise/input
		System.out.println("Please enter your race time in seconds");
			driverTime=scan.nextInt();
		//set
		l.setDriverTime(driverTime);
		//compute
		l.computeNumLaps();
		l.computeLeftoverTime();
		l.computeTrackRem();
		//get
		numLaps=l.getNumLaps();
		leftoverTime=l.getLeftoverTime();
		trackRem=l.getTrackRem();
		//output
		System.out.println("If your race time is "+driverTime+" seconds, then your number of laps should be "+numLaps);
		System.out.println("This is how many second will be remaining after your laps; "+leftoverTime+" seconds");
		System.out.println("This is the remaining % of the track; "+trackRem+" %");
	}
}