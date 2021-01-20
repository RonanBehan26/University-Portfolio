public class DefaultEmail{
	private String fname;
	private String lname;
	private String firstLast;
	private int x;
	private String newEmail;
	private StringBuffer strBuff;

	//constructor
	public DefaultEmail(){
		strBuff=new StringBuffer();
	}
	//set method
	public void setFName(String fname){
		this.fname=fname;
	}
	public void setLName(String lname){
		this.lname=lname;
	}
	public void setX(int x){
		this.x=x;
	}

	//compute
	public void computeNewEmail(){
		firstLast=fname+lname;
		for(int i=0;i<firstLast.length();i++){
			if(firstLast.charAt(i)=='!' || firstLast.charAt(i)=='?'){
				strBuff.append('_');
			}
			else if(i==x){
				strBuff.append('.');
				strBuff.append(firstLast.charAt(i));
			}
			else{
				strBuff.append(firstLast.charAt(i)); //otherwise we just add in the character we were looking at, or throw in the rest of the
			}
		}
		newEmail=strBuff.toString(); // take on the new values and give name newEmail turn the string buffer back into a string
		newEmail=newEmail+"@gmail.com";
	}



	public String getNewEmail(){
		return newEmail;
	}
}