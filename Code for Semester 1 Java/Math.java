public class Math{
	private int save;
	private int months;
	private int ans;

	//set
	public void setSave(int save){
			this.save=save;
	}

	public void setMonths(int months){
				this.months=months;
	}

	//compute
	public void computeAns(){
		ans=save*months;
	}

	//get
	public int getAns(){
			return ans;
		}

}
