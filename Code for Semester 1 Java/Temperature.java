public class Temperature {

	// data Members
	double celsius;
	double fahrenheit;


    // set method(s)
    public void setCelsius(double celsius){
		this.celsius=celsius;
    }

    // compute method(s)
	public void computeFahrenheit(){
		fahrenheit = (celsius*9/5) + 32;
    }

    // get methods(s)
    public double getFahrenheit(){
		return fahrenheit;
    }
}