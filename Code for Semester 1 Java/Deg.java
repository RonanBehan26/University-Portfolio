public class Deg{
	//vars
	private double modOne;
	private double modTwo;
	private double modThree;
	private double modFour;
	private double modFive;
	private double average;
	private String result;
	//contructors
	//set
	public void setModOne(double modOne){
		this.modOne=modOne;
	}

	public void setModTwo(double modTwo){
			this.modTwo=modTwo;
	}

	public void setModThree(double modThree){
			this.modThree=modThree;
	}

	public void setModFour(double modFour){
			this.modFour=modFour;
	}

	public void setModFive(double modFive){
			this.modFive=modFive;
	}
	//compute
	public void computeAverage(){
		average=((modOne+modTwo+modThree+modFour+modFive)/5);
		if(average>=70){
			result="1.1 " +average;
		}
		else if(average>=60 || average<=69){
			result="2.1 " +average;
		}
		else if(average>=50 || average<=59){
					result="2.2 " +average;
		}
		else if(average>=40 || average<=49){
			result="pass " +average;
		}
		else if(average<40){
			result="Fuck off home you bollock";
		}
	}
	//get
	public String getResult(){
		return result;
	}
}