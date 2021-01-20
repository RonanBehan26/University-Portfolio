import java.util.Scanner;
public class ArraysApp{
	public static void main(String args[]){
// structure depends on the necessities
		int[] numbers = new int[5];

		Scanner scan = new Scanner(System.in); //dec and creat Scanner
		Arrays a; // dec arrays obj

		for(int i = 0; i < numbers.length; i++){
			System.out.println("Enter the data: ");
			numbers[i] = scan.nextInt();
		}
		System.out.println("Now I have all data in array");
		//creat obj
		a = new Arrays(numbers); // declare ew instance of Arrays object
		//created arrays obj with numbers

		a.sum(); //call set and get from instantiable
		System.out.println("Sum of Array: "+ a.getSum());
	}

}