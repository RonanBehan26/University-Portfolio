public class Oe{

//dec vars
private int number;
private String msg;

//set
public void setNumber(int number){
	this.number=number;
}

//compute
public void computeMsg(){
	if(number%2==0){
		msg="Even number.";
	}

	else{
		msg="Odd number.";
	}
}

//get
	public String getMsg(){
		return msg;
	}
}







