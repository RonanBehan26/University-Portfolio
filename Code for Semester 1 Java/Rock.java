public class Rock{
	//vars
	private int choice;
	private int computer; //computer's random choice.
	private String msg;
	//con
	//set
	public void setChoice(int choice){
		this.choice=choice;
	}
	//comp
	public void gameLogic(){
		computer=(int)(Math.random()*3)+1;
			System.out.println(computer);
			if(choice==1 && computer==1){
				msg="Rock and Rock, go again";
			}
			else if(choice==2 && computer==1){
				msg="Paper beats rock, you win!";
			}
			else if(choice==3 && computer==1){
				msg="Scissors loses against rock, you lose";
			}
			else if(choice==1 && computer==2){
				msg="paper beats rock, you lose";
			}
			else if(choice==1 && computer==3){
				msg="Rock beats scissors, you win!";
			}
			else if(choice==2 && computer==2){
				msg="Paper, paper, go again";
			}
			else if(choice==2 && computer==3){
				msg="scissors beats paper, you lose";
			}
			else if(choice==3 && computer==2){
				msg="scissors beats paper, you win";
			}
			else if(choice==3 && computer==3){
				msg="scissors, scissors, go again";
			}
	}
	//get
	public String getMsg(){
		return msg;
	}
}