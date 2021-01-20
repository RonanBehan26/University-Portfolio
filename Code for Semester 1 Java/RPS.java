public class RPS{
	//vars
	private int userChoice, computerChoice;
	private String msg;
	private boolean win=false;
	//set method
	public void setUserChoice(int userChoice){
		this.userChoice=userChoice;
		}
	public void setComputerChoice(int computerChoice){
		this.computerChoice=computerChoice;
		}
	//compute
	public void computeMsg(){
		if(userChoice==1 && computerChoice==2){
			msg="You chose Rock, the Computer chose Paper. You lose!";
		}
		else if(userChoice== 2 && computerChoice==3){
			msg="You chose Paper, the Computer chose Scissors. You lose!";

		}
		else if(userChoice==1 && computerChoice==3){
			msg="You chose Rock, the Computer chose Scissors. You win!";
			win=true;
		}
		else if(userChoice==2 && computerChoice==1){
			msg="You chose Paper, the Computer chose Rock. You win!";
			win=true;
		}
		else if(userChoice==3 && computerChoice==2){
			msg="You chose Scissors, the Computer chose paper. You win!";
			win=true;
		}
		else{
			msg="You both chose the same thing. Try again.";
		}
	}
	//get
	public String getMsg(){
		return msg;
	}
	public boolean getWin(){
		return win;
	}
}