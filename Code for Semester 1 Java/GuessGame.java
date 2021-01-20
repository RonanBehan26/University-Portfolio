public class GuessGame{
	//vars
	private int guess, cGuess;
	private String msg;
	//cons
	//set
	public void setGuess(int guess){
		this.guess=guess;
	}
	public void setCGuess(int cGuess){
		this.cGuess=cGuess;
	}
	//comp
	public void computeMsg(){
		if(guess==cGuess){
			msg="Bingo";
		}
		else if(guess<cGuess){
				msg="Low";
		}
		else if(guess>cGuess){
				msg="High";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
}