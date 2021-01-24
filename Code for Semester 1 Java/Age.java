public class Age{
	//vars
	private int age;
	private String result;
	//constructors
	//set
	public void setAge(int age){
		this.age=age;
	}
	//compute
	public void computeResult(){
	if(age<18 || age>=70){
		result="Go home";
	}
	else if(age>=18 && age<=34){
		result="5e";
	}
	else if(age>=35 && age<=69){
		result="Come in out o the cold you auld fella";
	}


	}
	//get
	public String getResult(){
		return result;
	}

}
