public class JobOne{
	//dec vars
	private double hours;
	private double overHours;
	private double pay;
	private double overPay;
	private double money;
	//set
	public void setHours(double hours){
		this.hours=hours;
	}
	public void setOverHours(double overHours){
		this.overHours=overHours;
	}
	public void setPay(double pay){
		this.pay=pay;
	}
	public void setOverPay(double overPay){
		this.overPay=overPay;
	}

	//compute
	public void computeMoney(){
		money=(hours*pay)+(overHours*overPay);
	}

	//get
	public double getMoney(){
		return money;
	}
}
