public class Guess{
	//vars
	private int secret;
	private int guess;
	private String result;
	//constructors
	//set
	public void setGuess(int guess){
		this.guess=guess;
	}
	//compute
	public void gameLogic(){
		secret=((int)Math.random()*10)+1;
		System.out.println(secret);
		if(guess==secret){
			result="Bingo Baby!";
		}
		else if(guess>secret){
			result="too high";
		}
		else if(guess<secret){
			result="too low";
		}
	}
	//get
	public String getResult(){
		return result;
	}

}