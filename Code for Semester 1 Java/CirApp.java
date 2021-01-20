import java.util.Scanner;
public class CirApp{
	public static void main(String[] args){
	//vars
	double raD;
	double arEa;
	//dec/cre obj
	Cir c;
	c=new Cir();
	Scanner scan=new Scanner(System.in);
	//instatntiate/input
	System.out.println("Please enter the radius");
		raD=scan.nextDouble();
	//set
	c.setRaD(raD);
	//compute
	c.computeArEa();
	//get
	arEa=c.getArEa();
	//output
	System.out.println("The area of your circle is "+arEa+" cm squared");
}
}