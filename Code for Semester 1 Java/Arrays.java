/*
find the sum of all numbers in the array
*/
import java.util.Random;
public class Arrays{
	//vars - the structure is always the same in instantiable
	Random r = new Random(); //create the random
	private int[] numbers = new int[5]; //dec arrays
	private int sum = 0; //sum of all number in the array, you want to start at 0
	//numbers = new int[5]; //create the array - if 80 elements type in 79, can do like this or put above as it is

	//constructors - accepting the array so when you create instance in app, take in perameter and sending over
	public Arrays(int[] numbers){
		this.numbers = numbers;
	}

	//setter
	public void setArray(int[] numbers){
		this.numbers = numbers;
	}


	//my other methods - we need to iterate the array(pass over)
	public void sum(){
		int random = r.nextInt(6) +1; // send the random to the cell
		for(int i = 0; i <numbers.length; i++){ //can be 1 if you want, numbers.length will protect you from going beyond the array
			sum = sum + numbers[i]; // adding i each time
		}
	}

	//getter
	public int getSum(){
		return sum;
	}
}