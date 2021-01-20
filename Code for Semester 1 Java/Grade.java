public class Grade{
	//vars
	private String grade;
	private double average;
	private double[] results;
	//const - inst
	public Grade(){
		results=new double[5];
	}
	//set
	public void setResults(double[] results){
		this.results=results;
	}

	//comp
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
	}


	//get
	public double getAverage(){
		return average;
	}
	public String getGrade(){
		return grade;
	}
}