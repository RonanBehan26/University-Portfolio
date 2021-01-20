public class JavaRock{
	public static void main(String[] args){

		for(int i = 200; i <= 300; i++){

			if(i%4==0 && i%6==0){
				System.out.println("Java Rocks!");

			}
			else if(i%6==0){
				System.out.println("Java");

			}
			else if(i%4==0){
				System.out.println("Rocks");
			}

			else{
				System.out.println(+i);

			}

		}

	}
}
