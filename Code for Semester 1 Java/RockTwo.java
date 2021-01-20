public class RockTwo{

	//dec vars
	private int hand;
	private int Rock;
	private int Paper;
	private int Scissors;
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

		if((hand==Rock && computerGuess==2) || (hand==Paper && computerGuess==3) || (hand==Scissors && computerGuess==1)){
			answer="You lose";
		}
		else if((hand==Rock && computerGuess==3) || (hand==Paper && computerGuess==1) || (hand==Scissors && computerGuess==2)){
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

