public class Job{
	//vars
	private double bHours;
	private double oHours;
	private double bPayHour; //basic pay per hour
	private double oPayHour;
	private double tBpay; //total basic pay
	private double tOpay;
	private double tPay; //total pay
	//constructors
	//set
	public void setBHours(double bHours){
		this.bHours=bHours;
	}

	public void setOHours(double oHours){
		this.oHours=oHours;
	}

	public void setBPayHour(double bPayHour){
		this.bPayHour=bPayHour;
	}

	public void setOPayHour(double oPayHour){
			this.oPayHour=oPayHour;
	}
	//compute*
	public void computeTBpay(){
		tBpay=bHours*bPayHour;
	}

	public void computeTOpay(){
		tOpay=oHours*oPayHour;
	}

	public void computeTPay(){
		tPay=tBpay+tOpay;
	}

	//get
	public double getTBpay(){
		return tBpay;
	}

	public double getTOpay(){
		return tOpay;
	}

	public double getTPay(){
		return tPay;
	}
}