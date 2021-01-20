public class Season{
	private int month;
	private String msg;
	//set
	public void setSeason(int month){
		this.month=month;
	}
	//compute
	public void computeMsg(){
		if(month==2 || month==3 || month==4){
			msg="That's spring.";
		}
		else if(month==5 || month==6 || month==7){
			msg="That's summer.";
		}
		else if(month==8 || month==9 || month==10){
			msg="That's autumn.";
		}
		else{
			msg="That's winter.";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}