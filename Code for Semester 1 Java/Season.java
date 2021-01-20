public class Season{
	//vars
	private int month;
	private String msg;
	//con
	//set
	public void setMonth(int month){
		this.month=month;
	}
	//com
	public void computeMsg(){
		if(month>=1 && month<=3){
			msg="Spring";
		}
		else if(month>=4 && month<=6){
			msg="Summer";
		}
		else if(month>=7 && month<=9){
			msg="Autumn";
		}
		else if(month>=10 && month<=12){
			msg="Winter";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}