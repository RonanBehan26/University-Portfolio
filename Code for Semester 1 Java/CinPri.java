public class CinPri{

	//midweek=2,3 weekend=5,6,7

	//dec vars
	private int age;
	private int day;
	private double cost;


	//set
	public void setCinPri(int age){
			this.age=age;
		}

	public void setCinPriTwo(int day){
				this.day=day;
		}

	//compute
	public void computeCost(){
		if(age<5){
					cost=0;
		}
		else if((age>=5 && age<=14) && (day==1 || day==4)){
					cost=5.50;
		}
		else if((age>=5 && age<=14) && (day==2 || day==3)){
					cost=4.95;
		}
		else if((age>=5 && age<=14) && (day==5 || day==6 || day==7)){
							cost=6.05;
		}
		else if((age>=15 && age<=65) && (day==1 || day==4)){
					cost=10.90;
		}
		else if((age>=15 && age<=65) && (day==2 || day==3)){
							cost=9.81;
		}
		else if((age>=15 && age<=65) && (day==5 || day==6 || day==7)){
							cost= 11.99;
		}
		else{
			cost=0;
		}
	}
	//get
	public double getCost(){
		return cost;
	}
}





