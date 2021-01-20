/*
*InstantiableClass
*@Author Ronan
*30/09/19
*/

public class InstantiableClass{
	//data members
	private int m;
	private int cm;

	//constuctor
	public InstantiableClass(){
		m = 0;
		cm = 0;
	}

	//set method - one for every input
	public void setM(int m){
		this.m = m;
	}

	//compute - process
	public void compute(){
		cm = m*100;
    }

    //get method - one for every output
    public int getCm(){
		return cm;
	}
}