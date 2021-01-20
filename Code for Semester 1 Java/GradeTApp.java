import java.util.Scanner;
public class GradeTApp{
	public static void main(String args[]){
		//vars
		String grade;
		double average;
		double[] results=new double[5];
		//dec cre obj
		GradeT g=new GradeT();
		Scanner scan=new Scanner(System.in);
		//initialize
		for(int i=0; i<results.length; i++){
			System.out.println("Enter your grades for mod: "+(i+1));
			results[i]=scan.nextDouble();
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
			System.out.println("The results of mod "+(i+1)+" are: "+results[i]);
		}
		System.out.println("The average is: "+average);
		System.out.println("Your overall grade is: "+grade);
	}
}