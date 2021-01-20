import java.util.Scanner;
public class JobApp{
	public static void main(String[] args){
		//vars
		double bHours;
		double oHours;
		double bPayHour; //basic pay per hour
		double oPayHour;
		double tBpay; //total basic pay
		double tOpay;
	    double tPay; //total pay
		//dec/cre obj
		Job j;
		j=new Job();
		Scanner scan=new Scanner(System.in);
		//initialize/input
		System.out.println("Please enter the total number of basic hours you will work per week");
			bHours=scan.nextDouble();

		System.out.println("Please enter the basic pay per hour");
			bPayHour=scan.nextDouble();

		System.out.println("Please enter the total number of overtime hours you will work per week");
			oHours=scan.nextDouble();

		System.out.println("Please enter the overtime pay per hour");
			oPayHour=scan.nextDouble();

		//set
		j.setBHours(bHours);
		j.setBPayHour(bPayHour);
		j.setOHours(oHours);
		j.setOPayHour(oPayHour);
		//compute
		j.computeTBpay();
		j.computeTOpay();
		j.computeTPay();
		//get
		tBpay=j.getTBpay();
		tOpay=j.getTOpay();
		tPay=j.getTPay();
		//output
		System.out.println("Your total basic pay for your basic weekly working hours shall be "+tBpay+" euros");
		System.out.println("Your total overtime pay for your overtime weekly working hours shall be "+tOpay+" euros");
		System.out.println("Your total pay for all working hours per week is "+tPay+" euros");
	}
}