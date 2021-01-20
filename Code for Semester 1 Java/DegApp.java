import java.util.Scanner;
public class DegApp{
	public static void main(String args[]){
		//vars
		double modOne;
		double modTwo;
		double modThree;
		double modFour;
		double modFive;
		double average;
		String result;
		//cre/dec obj
		Deg d;
		d=new Deg();
		Scanner scan=new Scanner(System.in);
		//instantiate
		System.out.println("Please enter your grade for mod 1");
			modOne=scan.nextInt();

		System.out.println("Please enter your grade for mod 2");
			modTwo=scan.nextInt();

		System.out.println("Please enter your grade for mod 3");
			modThree=scan.nextInt();

		System.out.println("Please enter your grade for mod 4");
			modFour=scan.nextInt();

		System.out.println("Please enter your grade for mod 5");
			modFive=scan.nextInt();
		//set
		d.setModOne(modOne);
		d.setModTwo(modTwo);
		d.setModThree(modThree);
		d.setModFour(modFour);
		d.setModFive(modFive);
		//compute
		d.computeAverage();
		//get
		result=d.getResult();
		//output
		System.out.println(result);
	}
}