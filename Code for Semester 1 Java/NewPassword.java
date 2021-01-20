public class NewPassword{
	//declare vars
	private String originalPass;
	private String newPass;
	private StringBuffer strBuff;
	//constructor
	public NewPassword(){
		strBuff=new StringBuffer();
	}
	//set
	public void setOriginalPass(String originalPass){
		this.originalPass=originalPass;
	}
	//compute
	public void computeNewPass(){
		for(int i=0;i<originalPass.length();i++){
			if(originalPass.charAt(i)=='a'  ||
				originalPass.charAt(i)=='e' ||
				originalPass.charAt(i)=='i' ||
				originalPass.charAt(i)=='o' ||
				originalPass.charAt(i)=='u' ||
				originalPass.charAt(i)=='A' ||
				originalPass.charAt(i)=='E' ||
				originalPass.charAt(i)=='I' ||
				originalPass.charAt(i)=='O' ||
				originalPass.charAt(i)=='U'
			){
				for(int j=originalPass.length()-1;j>=0;j--){
					if(originalPass.charAt(j)==' '){
						strBuff.append('*');
					}
					else{
						strBuff.append(originalPass.charAt(j));
					}
				}
				newPass=strBuff.toString();
				break;
			}
			else{
				newPass="Not Valid, no vowel found";
			}
		}

	}
	//get
	public String getNewPass(){
		return newPass;
	}

}