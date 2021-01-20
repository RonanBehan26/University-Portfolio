public class Future{
	//vars
	private int age;
	private int birthYear;
	//constructors
	//set
	public void setBirthYear(int birthYear){
		this.birthYear=birthYear;
	}
	//compute*
	public void computeAge(){
		age=2050 - birthYear;
	}
	//get
	public int getAge(){
	return age;
	}
}
