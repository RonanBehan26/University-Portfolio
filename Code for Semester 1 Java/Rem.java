public class Rem{
	//vars
	private double income;
	private double expenses;
	private double ansMonth;
	private double ansYear;
	private double ansTenYears;

	//constructors
	//set
	public void setIncome(double income){
		this.income=income;
	}

	public void setExpenses(double expenses){
		this.expenses=expenses;
	}

	//compute *
	public void computeAnsMonth(){
		ansMonth=income-expenses;
	}

	public void computeAnsYear(){
		ansYear=((income-expenses)*12);
	}

	public void computeAnsTenYears(){
		ansTenYears=((income-expenses)*120);
	}
	//get
	public double getAnsMonth(){
		return ansMonth;
	}

	public double getAnsYear(){
		return ansYear;
	}

	public double getAnsTenYears(){;
		return ansTenYears;
	}
}