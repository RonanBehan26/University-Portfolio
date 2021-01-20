public class Beer{
	public static void main(String[] args){

		for(int i = 99; i >= 0; i--){

			System.out.println(i+" bottles of beer on the wall, "+i+" bottles of beer.Take one down and pass it around, "+(i-1)+" bottles of beer on the wall.");
			if(i==0){
				System.out.println("Go to the store and buy some more, 99 bottles of beer on the wall.");
			}

		}

	}
}