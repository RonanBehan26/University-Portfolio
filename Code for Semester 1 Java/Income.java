public class Income{
	private int income;
	private int expenditure;
	private int ansOne;
	private int ansTwo;
	private int ansThree;

	//set
		public void setIncome(int income){
				this.income=income;
		}

		public void setExpenditure(int expenditure){
					this.expenditure=expenditure;
		}

	//compute
	public void computeAnsOne(){
		ansOne=income-expenditure;
	}

	public void computeAnsTwo(){
			ansTwo=(income-expenditure)*12;
	}

	public void computeAnsThree(){
			ansThree=(income-expenditure)*120;
	}

	//get
	public int getAnsOne(){
		return ansOne;
	}

	public int getAnsTwo(){
		return ansTwo;
	}

	public int getAnsThree(){
		return ansThree;
	}
}

