public class Sec{
	//vars
	private int secret;
	private int guess;
	private String ans;

	//construc
	//set
	public void setGuess(int guess){
		this.guess=guess;
	}
	//compute/process
	public void gameLogic(){
		secret=(int)(Math.random()*10)+1;
		System.out.println(secret);
		if(guess==secret){
			ans="Yes";
		}
		else if(guess<secret){
			ans="Oh boy, too low, you better guess again buddy";
		}
		else if(guess>secret){
			ans="Too high";
		}
	}
	//get
	public String getAns(){
			return ans;
	}

}