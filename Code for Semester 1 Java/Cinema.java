public class Cinema{
	//vars
	private int age;
	private String msg;
	//constr
	//set
	public void setAge(int age){
		this.age=age;
	}
	//compu
	public void computeMsg(){
		if(age<5 || age>65){
			msg="free";
		}
		else if(age>=5 && age<=14){
			msg="5.50e";
		}
		else if(age>=15 && age<=65){
			msg="10.90e";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}