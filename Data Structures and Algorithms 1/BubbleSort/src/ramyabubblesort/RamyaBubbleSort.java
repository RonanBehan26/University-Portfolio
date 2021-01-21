package ramyabubblesort;
// j in index, i is iterations it will go through
public class RamyaBubbleSort {
    static void bubbleSort(int arr[], int x){
        int i,j;
        int x = arr.length;
        
        for(i = 0; i< x - 1; i++) //arr length
                   for(j = 0; j < x - i -1; j++)
                       if(arr[j] > arr[j+1])
                       {
                        int temp = arr[j] ; 
                        arr[j] = arr[arr[j + 1]];
                        arr[j + 1] = temp;
                       }
                }
    
            public void print(int arr[]){
                int x = arr.length;
                for (int i = 0; i<x; i++)
                    System.out.println(arr[i] + "");
                    System.out.println();
                          
            )
    }

    public static void main(String[] args) {
        BubbleSort bubble = new BubbleSort();
        int arr[] = (5,1,4,2,8,9);
        bubble.bubbleSort(arr);
        System.out.println("Sorted Array");
    }
    
}
