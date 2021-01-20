public class Gue{
	//vars
	private int secret;
	private int guess;
	private String result;
	//cons
	//set
	public void setGuess(int guess){
		this.guess=guess;
	}
	//com*
	public void gameLogic(){
		secret=(int)(Math.random()*10)+1;
		System.out.println(secret);
		if(guess<secret){
			result="Too low";
		}
		else if(guess>secret){
			result="Too high";
		}
		else if(guess==secret){
			result="Bingo";
		}
	}
	//get
	public String getResult(){
		return result;
	}
}