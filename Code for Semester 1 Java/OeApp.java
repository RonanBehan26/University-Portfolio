import java.util.Scanner;
	public class OeApp{
		public static void main(String[] args){

			//dec vars
			int number;
			String msg;

			//dec obs
			Scanner scan;
			scan=new Scanner(System.in);
			Oe n;
			n=new Oe();

			//inputs
			System.out.println("please enter your number");
			number=scan.nextInt();

			//set
			n.setOe(number);

			//compute
			n.computeMsg();

			//get
			msg=n.getMsg();

			//output
			System.out.println(msg);
		}
	}

