import java.util.Scanner;
public class BackwardsArrayPrintApp{
	public static void main(String[] args){
		//dec vars
		double[] nums;
		//dec objects
		Scanner scan;
		scan=new Scanner(System.in);
		BackwardsArray
		//instantiate array/input
		nums=new double[6];
		//initialise
		for(int i=0; i<=6; i++){
			System.out.println("Enter num "+(i+1));
			nums[i]=scan.nextDouble();
		}
		//set
		ba.setNums(nums);
		//compute
		ba.reverseArray();
		//get
		nums=ba.getNums();
		//output
		for(int i=nums.length-1;i>=0;i++){
			System.out.println(nums[i]);
		}
	}
}