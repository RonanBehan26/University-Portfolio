import java.util.Scanner;
	public class OeApp{
		public static void main(String[] args){

			//dec vars
			int number;
			String msg;

			//dec obs
			Scanner scan;
			scan=new Scanner(System.in);
			Oe M;
			M=new Oe();

			//inputs
			System.out.println("please enter your number");
			number=scan.nextInt();

			//set
			M.setOe(number);

			//compute
			M.computeMsg();

			//get
			msg=M.getMsg();

			//output
			System.out.println(msg);
		}
	}

