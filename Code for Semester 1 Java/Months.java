public class Months(
	private int month;
	private String msg;
	//put in details and get back a string

	//set
	public void setMont(int Month){
		this.month=month;
	}
	//compute
	public void computeMsg(){
		if(month==1 || month==3 || month==5 || month==7 || month==8 || month==8 || month==12){
			msg="31 days in that month";
		}
		else if(month==2){
			msg="28 days in that month";
		}
		else if(month==4 || month==6 || month==9 || month==11
			msg"30 days in that month";
		}
		else{
			msg="Invalid month";
		}
		//get
		public string getMsg(){
			return msg;
		}

}