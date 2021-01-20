import java.util.Scanner;
public class BackwardsArrayPrintApp{
	public static void main(String[] args){
		//declare vars
		double[] nums;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		//instantiate array
		nums=new double[6];
		//initialise array
		for(int i=0;i<nums.length;i++){
			System.out.println("Enter number "+(i+1));
			nums[i]=scan.nextDouble();
		}
		//output
		for(int i=nums.length-1;i>=0;i--){
			System.out.println(nums[i]);
		}

	}
}