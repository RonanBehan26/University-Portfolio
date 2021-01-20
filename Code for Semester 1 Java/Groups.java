public class Groups{
	//declare vars
	private int birthYear;
	private int futureYear=2050;
	private int ageAtTwentyFifty;

	//set method
	public void setbirthYear(int birthYear){
		this.birthYear=birthYear;
	}

	//compute/process
	public void computeAgeAtTwentyFifty(){
		ageAtTwentyFifty=futureYear-birthYear;
	}

	//get
	public int getAgeAtTwentyFifty(){
		return ageAtTwentyFifty;
	}

}
