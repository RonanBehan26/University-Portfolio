public class TwoHundred{
	public static void main(String[] args){
		for(int i=200; i<300; i++){
			System.out.println("# :"+i);
			if(i%4==0 || i%6==0){
				System.out.println("Java Rocks # "+i);
				if(i%4==0){
					System.out.println("Java # "+i);
				}
				else if(i%6==0){
					System.out.println("Rocks # "+i);
				}
			}
		}
	}
}