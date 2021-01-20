public class RemApp{
	public static void main(String[] args){
		//vars
		double income;
		double expenses;
		double ansMonth;
		double ansYear;
		double ansTenYears;
		//dec/create objects - other class, scanner, random
		Rem r;
		r=new Rem();
		//initialise - to give value to the vars *
		income = 4500.51;
		expenses = 2347.89;
		//set
		r.setIncome(income); //- this is bringing in the other class and using the values just provided in the lines above
		r.setExpenses(expenses);
		//compute
		r.computeAnsMonth();
		r.computeAnsYear();
		r.computeAnsTenYears();
		//get
		ansMonth=r.getAnsMonth();
		ansYear=r.getAnsYear();
		ansTenYears=r.getAnsTenYears();
		//output*
		System.out.println("Your remainder per month is "+ansMonth);
		System.out.println("Your remainder after one year is "+ansYear);
		System.out.println("Your remainder after ten years is "+ansTenYears);
	}
}