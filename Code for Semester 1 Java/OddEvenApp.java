import java.util.Scanner;
public class OddEvenApp{
	public static void main(String args[]){
	//vars
	double input;
	String msg;
	//dec/cre obj
	OddEven o;
	o=new OddEven();
	Scanner scan=new Scanner(System.in);
	//initialize
	System.out.println("Enter Number");
		input=scan.nextDouble();
	//set
	o.setInput(input);
	//comput
	o.computeMsg();
	//get
	msg=o.getMsg();
	//output
	System.out.println(msg);
	}
}