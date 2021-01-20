public class GuessingGame{
	//vars
	private int userChoice, computerChoice;
	private String msg;
	//set method
	public void setUserChoice(int userChoice){
		this.userChoice=userChoice;
		}
	public void setComputerChoice(int computerChoice){
		this.computerChoice=computerChoice;
		}
	//compute
	public void computeMsg(){
		if(userChoice==computerChoice){
			msg="Well Done!";
		}
		else if(userChoice >= computerChoice){
			msg="Lower!";
		}

		else if(userChoice <= computerChoice){
			msg="Higher!";
		}

	}

	//get
	public String getMsg(){
		return msg;
	}

}