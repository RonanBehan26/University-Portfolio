public class QuestionTwo{
	//declare vars
	private double[] mod;
	private double average;
	private String grade;
	//constructor
	public QuestionTwo(){
		mod=new double[5];
	}
	//set
	public void setMod(double[] mod){
		this.mod=mod;
	}
	//compute
	public void computeAverage(){
		average=(mod[0]+mod[1]+mod[2]+mod[3]+mod[4])/5;
	}
	//compute
	public void computeGrade(){
		System.out.println(average);
		if(average>=40 && average<=49){
			grade="Pass";
		}
		else if(average>=50 && average<=59){
			grade="2.2";
		}
		else if(average>=60 && average<=69){
			grade="2.1";
		}
		else if(average>=70){
			grade="1.1";
		}
		else{
			grade="Fail";
		}
	}
	//get
	public double getAverage(){
		return average;
	}
	public String getGrade(){
			return grade;
	}

}