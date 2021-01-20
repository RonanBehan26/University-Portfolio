public class Age{
	private int age;
	private String msg;
	//set
	public void setAge(int age){
		this.age=age;
	}
	//compute
	public void computeMsg(){
		if(age<18){
			msg="Not welcome";
		}
		else if(age>=18 && age<=34){
			msg="Welcome, 5e entry";
		}
		else if(age>=35 && age<=70){
			msg="Welcome, free entry";
		}
		else{
			msg="Not welcome";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}
