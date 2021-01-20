public class Loan{
	//vars
	private double money;
	private double months;
	private double interest;
	private double total;
	//constructors
	//set
	public void setMoney(double money){
		this.money=money;
	}

	public void setMonths(double months){
		this.months=months;
	}
	//compute
	public void computeInterest(){
		interest=0.03*money*months;
	}

	public void computTotal(){
		total=interest+money;
	}
	//get
	public double getInterest(){
		return interest;
	}

	public double getTotal(){
		return total;
	}
}