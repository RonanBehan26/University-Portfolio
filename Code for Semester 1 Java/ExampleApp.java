public class ExampleApp{
	public static void main(String[] args){
		//vars
		int x;
		int y;
		int ans;
		//objects
		Example ex;
		ex=new Example();
		//input
		x=7;
		y=9;
		//set
		ex.setX(x); //you can put any integer in here instead of x or y, no doubles though
		ex.setY(y);		//another way of sending something over
		//compute
		ex.computeAns();
		//get
		ans=ex.getAns();
		//output
		System.out.println(ans);
	}
}