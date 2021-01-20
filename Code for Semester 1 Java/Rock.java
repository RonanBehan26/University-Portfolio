public class Rock{

	//dec vars
	private int hand;
	private int computerGuess;
	private String answer;
	//hand indicates either rock,paper or scissors.

	//set
	public void setHand(int hand){
				this.hand=hand;
		}

	//compute
	public void gameLogic(){
		computerGuess=(int)(Math.random())+1;
		System.out.println(computerGuess);

		if((hand==1 && computerGuess==2) || (hand==2 && computerGuess==3) || (hand==3 && computerGuess==1)){
			answer="You lose";
		}
		else if((hand==1 && computerGuess==3) || (hand==2 && computerGuess==1) || (hand==3 && computerGuess==2)){
			answer="You win!";
		}
		else{
			answer="That's a draw!";
		}
	}
	//get
	public String getAnswer(){
		return answer;
	}

}

