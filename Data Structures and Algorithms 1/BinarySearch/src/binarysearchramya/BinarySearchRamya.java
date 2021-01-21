
/*
How to do
1. Say min = 1, max = n
2. Guesss average max and min
3. If you guessed the number Stop!
4. If num too low, set min to one larger than guess
5. If num too high, set max to one less than guess
6. Go to step 2 till right guess
7. so make a guess, if guess in one half ignore the other, if not in that half then move onto the other half

don't get confused between l and 1
*/

package binarysearchramya;

public class BinarySearchRamya {
    
    int binarySearch (int arr[], int l, int r, int x){ //int left, int right, x is the what you are looking for

    if (r >= l){ // if r > than l
    int mid = l + (r - l)/2; // to find average mid number
    
    if (arr[mid] == x) //  line 22: if your guess is what you are looking for and in mid position
        return mid;
    
    if (arr[mid] > x) // if mid position bigger than x
        return binarySearch(arr, l, mid - 1, x); // this means it goes back to the array, recursion to do it again, until it finds the right number

                //if these conditions aren't satisfied it will move onto this
                return binarySearch(arr, mid + 1, r, x); // see order is slightly different as l to left of mid, r right of mid
               
    }    
    return -1; // if value, you are lloking for outside bounds, this will give you an error, write anything here

}
    public static void main(String[] args) {
        BinarySearchRamya bin = new BinarySearchRamya(); //instantaible class
        int arr[] = {4,6,15,30,45};
        int n = arr.length;
        int x = 35;
        int result = bin.binarySearch(arr, 0, n-1, x); //calling the method, executes the code above, appied,and stored in result, 0 is left end, n - 1 is right end
                
        if (result == -1)
            System.out.println("Element Absent");
        else
            System.out.println("Element found at index position " +result);
    }
    
}
