public class GradeT{
	//vars
	private double[] results;
	private String grade;
	private double average;
	//const-instant
	public GradeT(){
		results=new double[5];
	}
	//set
	public void setResults(double[] results){
		this.results=results;
	}
	//compu
	public void computeAverage(){
		for(int i=0; i<results.length; i++){
			average=average+results[i];
		}
		average=average/results.length;
	}
	public void computeGrade(){
		if(average>=70){
			grade="1.1";
		}
		else if(average>=60 && average<=69){
			grade="2.1";
		}
		else if(average>=50 && average<=59){
					grade="2.2";
		}
		else if(average>=40 && average<=49){
					grade="Pass";
		}
		else if(average<40){
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