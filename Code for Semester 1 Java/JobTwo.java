public class JobTwo{
	//dec vars
	private double hoursT;
	private double overHoursT;
	private double payT;
	private double overPayT;
	private double moneyT;
	//set
	public void setHoursT(double hoursT){
		this.hoursT=hoursT;
	}
	public void setOverHoursT(double overHoursT){
		this.overHoursT=overHoursT;
	}
	public void setPayT(double payT){
		this.payT=payT;
	}
	public void setOverPayT(double overPayT){
		this.overPayT=overPayT;
	}

	//compute
	public void computeMoneyT(){
		moneyT=(hoursT*payT)+(overHoursT*overPayT);
	}

	//get
	public double getMoneyT(){
		return moneyT;
	}
}