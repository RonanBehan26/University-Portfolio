public class Math{
//Dev Vars - always private for the intantiable
	 	private int savings;
		private int years;
		private int ans; //this is what you are trying to compute
//constructor - you can set values for your variables
		//savings = 0;
		//years = 0;
		//ans = 0;
//set - so that we can correspond witht the App, these values mean those values
		public void setSavings(int savings){
			this.savings=savings;
		}
		public void setYears(int years){
			this.years=years;
		}

//compute // the extended compute
		public void computeAns(){
			ans=savings*years; // this is the actual calculation part
		}
//get - to return the answer to the app
		public int getAns(){
			return ans;
		}
}