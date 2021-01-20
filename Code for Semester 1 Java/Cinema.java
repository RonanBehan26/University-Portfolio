public class Cinema{
	private int age;
	private String msg;
	//set
	public void setCinema(int age){
		this.age=age;
	}
	//compute
	public void computeMsg(){
		if(age<5){
			msg="Free";
		}
		else if(age>=5 && age<=14){
			msg="£5.50";
		}
		else if(age>=15 && age<=65){
			msg="£10.90";
		}
		else{
			msg="Free";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}