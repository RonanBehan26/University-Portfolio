public class OddEven{
	private int number;
	private String msg;
	//set
	public void setOddEven(int number){
		this.number=number;
	}
	//compute
	public void computeMsg(){
		if(number%2==0){
			msg="It's even.";
		}
		else{
			msg="It's odd.";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}