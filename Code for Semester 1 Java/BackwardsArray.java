public class BackwardsArray{
	//vars
	private double[] nums;
	//constructor
	public BackwardsArray(){
		nums=new double[6];
		newNums=new double[nums.length];
	}
	//set - send over to instantiable
	public void setNums(double[] nums){
		this.nums=nums; //take array and put inside this array
	}

	//compute - in this case just reverse it
	public void reverseArray(){
		for(int i=0;i<nums.length;i++){
			newNums[i]=nums[(nums.length-1)-i];
	}
	//get
	public double[] getNums(){
		return nums;
}

//setting and getting array as they are here