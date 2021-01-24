public class AgeA{
	//vars
	private int age;
	private String result;
	//cons
	//set
	public void setAge(int age){
		this.age=age;
	}
	//com
	public void computeResult(){
		if(age<18 || age>70){
			result="Go home";
		}
		else if(age>=18 && age<=34){
			result="5e";
		}
		else if(age>=35 && age<=70){
			result="10e";
		}
	}
	//get
	public String getResult(){
		return result;
	}
}
