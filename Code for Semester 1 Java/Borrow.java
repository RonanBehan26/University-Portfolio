public class Borrow{
	//declare vars
	private int amount;
	private int months;
	private int interest;
	private int answer;

	//set methods
	public void setAmount(int amount){
		this.amount=amount;
	}

	public void setMonths(int months){
			this.months=months;
	}

	//process/compute
	public void computeinterest(){
		interest=((amount*.03)*months);
	}

	public void computeanswer(){
			answer=(amount+interest);
	}

	//get
	public int answer(){
		return answer;
	}
}