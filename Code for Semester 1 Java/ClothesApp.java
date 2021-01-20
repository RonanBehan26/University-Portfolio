import java.util.Scanner;
public class ClothesApp{
	public static void main(String[] args){
		//vars
		int hats, tshirts, hoodies;
		double hatCost, tshirtCost, hoodieCost;
		double totalCost;
		//dec/create objects
		Scanner scan;
		scan=new Scanner(System.in);
		Clothes c;
		c=new Clothes();
		//instantiate/input
		System.out.println("Please enter the number of hats you want");
		hats=scan.nextInt();

		System.out.println("please enter the no. of tshirts you want");
		tshirts=scan.nextInt();

		System.out.println("Please enter the amount of hoodies you want");
		hoodies=scan.nextInt();
		//set
		c.setHats(hats);
		c.setTshirts(tshirts);
		c.setHoodies(hoodies);
		//compute
		c.computeHatCost();
		c.computeTshirtCost();
		c.computeHoodieCost();
		c.computeTotalCost();
		//get
		hatCost=c.getHatCost();
		tshirtCost=c.getTshirtCost();
		hoodieCost=c.getHoodieCost();
		totalCost=c.getTotalCost();
		//output
		System.out.println("The total cost of the hats you want are "+hatCost+" euros");
		System.out.println("The total cost of the tshirts you want are "+tshirtCost+" euros");
		System.out.println("The total cost of the hoodies you want are "+hoodieCost+" euros");
		System.out.println("The total cost of your purchase is "+totalCost+" euros");

	}
}