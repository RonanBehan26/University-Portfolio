public class SamG{
	public static void main(String[] args){
		int bothCount = 0;
		int twoCount = 0;
		int threeCount = 0;
		for(int i = 0; i <= 100; i++){
			if(i%2==0 && i%3==0){
				System.out.println("Hi #"+i+"*");
				bothCount++;
			}
			else if(i%2==0){
				System.out.println("Hi #"+i);
				twoCount++;
			}
			else if(i%3==0){
				System.out.println("Hi #"+i);
				threeCount++;
			}

		}
		System.out.println(bothCount);
		System.out.println(twoCount);
		System.out.println(threeCount);
	}
}
