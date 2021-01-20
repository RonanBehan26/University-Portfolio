import java.util.Scanner;
public class ModApp{
	public static void main(String[] args){
		//vars
		double modOne;
		double modTwo;
		double modThree;
		double modFour;
		double modFive;
		double average;
		//dec/cre objects
		Scanner scan=new Scanner(System.in);
		Mod m;
		m=new Mod();
		//initialise/input
		System.out.println("Please enter your grade for Module One.");
		modOne=scan.nextDouble();

		System.out.println("Please enter your grade for Module Two.");
		modTwo=scan.nextDouble();

		System.out.println("Please enter your grade for Module Three.");
		modThree=scan.nextDouble();

		System.out.println("Please enter your grade for Module Four.");
		modFour=scan.nextDouble();

		System.out.println("Please enter your grade for Module Five.");
		modFive=scan.nextDouble();
		//set
		m.setModOne(modOne);
		m.setModTwo(modTwo);
		m.setModThree(modThree);
		m.setModFour(modFour);
		m.setModFive(modFive);
		//compute
		m.computeAverage();
		//get
		average=m.getAverage();
		//output
		System.out.println("The average of all of your grades is "+average);
	}
}