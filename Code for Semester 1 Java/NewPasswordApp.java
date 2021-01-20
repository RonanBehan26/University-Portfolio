import java.util.Scanner;
public class NewPasswordApp{
	public static void main(String[] args){
		//declare vars
		String originalPass;
		String newPass;
		//objects
		Scanner scan;
		scan=new Scanner(System.in);
		NewPassword np;
		np=new NewPassword();
		//inputs
		do{
		System.out.println("Enter your password (9 in length)");
		originalPass=scan.nextLine();
		}while(originalPass.length()!=9);
		//set
		np.setOriginalPass(originalPass);
		//compute
		np.computeNewPass();
		//get
		newPass=np.getNewPass();
		//output
		System.out.println(newPass);
	}
}