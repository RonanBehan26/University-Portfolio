import java.util.Scanner;
public class GrindOneApp{
	public static void main(String[] args){
		//declare vars
		 double[] mod= new double[5];
		 double average;
		 //declare objects
		 GrindOne a;
		 a=new GrindOne();
		 Scanner scan;
		 scan=new Scanner(System.in);
		 //inputs
		 for(int i = 0; i<mod.length; i++){
			 System.out.println("Enter module result");
			 mod[i]=scan.nextDouble();
		 }


		 //set
		 a.setMod(mod);

		//compute
		a.computeAverage();
		//get
		average=a.getAverage();
		//output
		System.out.println("Your average result is: "+average);
	}
}