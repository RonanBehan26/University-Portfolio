import java.util.Scanner;
public class JobsApp{
	public static void main(String[] args){

		//dec vars
		double hours;
		double overHours;
		double pay;
		double overPay;
		double money;
		double hoursT;
		double overHoursT;
		double payT;
		double overPayT;
		double moneyT;

		//dec obs
		Scanner scan;
		scan = new Scanner(System.in);
		JobOne A;
		A=new JobOne();
		JobTwo B;
		B=new JobTwo();

		//inputs
		System.out.println("Please enter your number of normal working hours for job A.");
			hours=scan.nextDouble();
				A.setHours(hours);

		System.out.println("Please enter your number of over hours for job A.");
			overHours=scan.nextDouble();
				A.setOverHours(overHours);

		System.out.println("Please enter your normal pay for job A.");
			pay=scan.nextDouble();
				A.setPay(pay);

		System.out.println("Please enter your overtime pay for job A.");
			overPay=scan.nextDouble();
				A.setOverPay(overPay);

		//B

		System.out.println("Please enter your number of normal working hours for job B .");
				hoursT=scan.nextDouble();
					B.setHoursT(hoursT);

		System.out.println("Please enter your number of over hours for job B.");
				overHoursT=scan.nextDouble();
					B.setOverHoursT(overHoursT);

		System.out.println("Please enter your normal pay for job B.");
				payT=scan.nextDouble();
					B.setPayT(payT);

		System.out.println("Please enter your overtime pay for job B.");
				overPayT=scan.nextDouble();
					B.setOverPayT(overPayT);

		//compute
		A.computeMoney();
		B.computeMoneyT();

		//get
		money=A.getMoney();
		moneyT=B.getMoneyT();

		//output
		System.out.println("Based on the data you have inputted, you will earn "+money+" per month for job A and "+moneyT+ "for job B");
	}
}


