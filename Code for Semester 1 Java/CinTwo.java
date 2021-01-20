public class CinTwo{
	//vars
	private int age;
	private int day;
	private String msg;
	//constr
	//set
	public void setAge(int age){
		this.age=age;
	}

	public void setDay(int day){
		this.day=day;
	}
	//compu
	public void computeMsg(){
		if(age<5 || age>65){
			msg="free";
		}
		else if(age>=5 && age<=14){
			msg="5.50e";
			if(day==3 || day==4){
				msg="4.95";
			}
			else if(day>=5 && day<=7){
				msg="6.05";
			}
		}
		else if(age>=15 && age<=65){
			msg="10.90e";
			if(day==3 || day==4){
				msg="9.81";
			}
			else if(day>=5 && day<=7){
				msg="11.99";
			}
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}