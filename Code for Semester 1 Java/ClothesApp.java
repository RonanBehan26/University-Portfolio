import java.util.Scanner;
	public class ClothesApp{
		public static void main(String[] args){

			//dec vars
			int hats, tshirts, hoodies;
			double cost;

			//dec objects
			Scanner scan;
			scan=new Scanner(System.in);
			Clothes M;
			M=new Clothes();

			//inputs
			System.out.println("Please enter the number of hats you would like.");
				hats=scan.nextInt();
				M.setHats(hats);

			System.out.println("Please enter the number of tshirts you would like.");
				tshirts=scan.nextInt();
				M.setTshirts(tshirts);

			System.out.println("Please enter the number of hoodies you want.");
				hoodies=scan.nextInt();
				M.setHoodies(hoodies);

			//compute
			M.computeCost();

			//get
			cost=M.getCost();


			//output
			System.out.println("Your purchase comes to "+hats+" hats "+tshirts+" tshirts and "+hoodies+" hoodies. This will add up to "+cost+" euro.");
		}
	}
