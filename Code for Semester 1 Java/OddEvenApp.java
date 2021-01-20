import java.util.Scanner;
public class OddEvenApp{
	public static void main(String[] args){
		//dec vars
		int number;
		String msg;
		//dec objs
		Scanner scan;
		scan=new Scanner(System.in);
		OddEven n;
		n=new OddEven();
		//inputs
		System.out.println("Enter a number");
		number=scan.nextInt();
		//set
		n.setOddEven(number);
		//compute
		n.computeMsg();
		//get
		msg=n.getMsg();
		//output
		System.out.println(msg);
	}
}