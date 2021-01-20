import java.util.Scanner;
public class StringApp{
	public static void main(String[] args){
		//declare vars
		 String[] mod= new String[5];
		 		 //declare objects
		 Scanner scan;
		 scan=new Scanner(System.in);
		 //inputs
		 for(int i = 0; i<mod.length; i++){
			 System.out.println("Enter day");
			 mod[i]=scan.nextLine();
		 }

		 for(int i = 0; i<mod.length; i++){
		 			 System.out.println(mod[i]);
		 }


	}
}