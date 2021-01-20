import java.util.Scanner;
public class QuestionTwoApp{
	public static void main(String[] args){
		//declare vars
		 double[] mod;
		 double average;
		 String grade;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		QuestionTwo qt;
		qt=new QuestionTwo();
		 //instantiate array/input
		mod=new double[5];
		 //initialise array
		 for(int i=0;i<mod.length;i++){
			 System.out.println("Enter grade "+(i+1));
			 mod[i]=scan.nextDouble();
		 }
		//set
		qt.setMod(mod);
		//compute
		qt.computeAverage();
		qt.computeGrade();

		//get
		average=qt.getAverage();
		grade=qt.getGrade();

		//output
		for(int i=0;i<mod.length;i++){
		System.out.println("Your average result is: "+average);
		}

		for(int i=0;i<mod.length;i++){
				System.out.println("Your grade is: "+grade);
		}


		for(int i=0;i<mod.length;i++){
				System.out.println(mod[i]);
		}

	}
}