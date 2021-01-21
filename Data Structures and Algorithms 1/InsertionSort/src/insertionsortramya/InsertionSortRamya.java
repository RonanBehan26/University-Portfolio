
package insertionsortramya;

public class InsertionSortRamya {
    
    /* sort the array */
    public void Sorting(int arr[]){
        int n = arr.length; // n is length of array 
        for (int i = 1; i < n; ++i){ // he does it different from her
        // i++ and ++i - what's the difference
        // i = 1, j = i++, i is 2, j = 1 - increments before, starts at 1
        // i = 1, j = ++i, i is 2, j = 1 - increments after, starts at the increment
            int key = arr[i];
            int j = i - 1;
            
            while (j >= 0 && arr[j] > key){
                //this section is where the comparing is done (this section)
                arr[j + 1] = arr[j];
                j= j -1;
            }
    }       arr{j + 1} = key;
    }
    
    public void print(int arr[]){
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.println(arr[i] + "");
            System.out.println();
}
    
    public static void main(String[] args) {
        int arr[] ={14,33,27,10,35,19,42,44};
        
        InsertionSortRamya is = new InsertionSortRamya();
        is.Sorting(arr);
        print(arr);
    }
    
}
// -----------------------------------------------------------