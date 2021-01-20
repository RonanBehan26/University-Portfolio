public class DefaultEmailT{
	//vars
	private String fName;
	private String lName;
	private String flName;
	private String email;
	private int x;
	private StringBuffer strBuf;
	//constr
	public DefaultEmailT(){
		strBuf=new StringBuffer();
	}

	//set
	public void setFName(String fName){
		this.fName=fName;
	}
	public void setLName(String lName){
			this.lName=lName;
	}
	public void setX(int x){
			this.x=x;
	}
	//comp
	public void computeEmail(){
		flName=fName+lName;
		for(int i=0; i<flName.length(); i++){
			if(flName.charAt(i)=='!' || flName.charAt(i)=='$'){
				strBuf.append('_');
			}
			else if(x==i){
				strBuf.append('.');
				strBuf.append(flName.charAt(i));
			}
			else{
				strBuf.append(flName.charAt(i));
			}
		}
		email=strBuf.toString();
		email=email+"@gmail.com";
	}
	//get
	public String getEmail(){
		return email;
	}
}