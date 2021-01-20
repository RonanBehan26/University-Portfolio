import java.util.Scanner;
public class RectangleApp{
	public static void main(String[] args){
		//declare vars
		int recHeight;
		int recWidth;
		int recArea;
		//declare objects
		Scanner scan;
		scan=new Scanner(System.in);
		Rectangle H;
		H=new Rectangle();
		//inputs
		System.out.println("Enter height of Rectangle:");
		recHeight=scan.nextInt();

		System.out.println("Enter width of Rectangle:");
		recWidth=scan.nextInt();
		//set
		H.setRectangleHeight(recHeight);
		H.setRectangleWidth(recWidth);
		//compute
		H.computerecArea();

		//get
		recArea=H.getrecArea();

		//output
		System.out.println("The area of your Rectangle is: "+recArea);


	}
}