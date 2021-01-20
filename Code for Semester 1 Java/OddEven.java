public class OddEven{
	//vars
	private double input;
	private String msg;
	//constr
	//set
	public void setInput(double input){
		this.input=input;
	}
	//comput
	public void computeMsg(){
		if((input%2)/2==0){
			msg="even";
		}
		else{
			msg="odd";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}

}