import java.util.Scanner;
public class GradeApp{
	public static void main(String args[]){
		//vars
		String grade;
		double[] results=new double[5];
		double average;
		//creat-dec
		Grade g=new Grade();
		Scanner scan=new Scanner(System.in);
		//initialize-input
		for(int i=0; i<results.length; i++){
			System.out.println("Enter your result for mod: "+(i+1));
			results[i]=scan.nextInt();
		}
		//set
		g.setResults(results);
		//compu
		g.computeAverage();
		g.computeGrade();
		//get
		average=g.getAverage();
		grade=g.getGrade();
		//output
		for(int i=0; i<results.length; i++){
			System.out.println("your results are: "+results[i]);
		}
		System.out.println("your average is: "+average);
		System.out.println("your grade is: "+grade);
	}
}