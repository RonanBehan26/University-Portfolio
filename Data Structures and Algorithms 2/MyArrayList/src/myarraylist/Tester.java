//RAMYA HELP FOR HIS CA PREP PAPER
package myarraylist;

import java.util.*;

public class Tester {
    static int rNum; //static remians the same until the end of the program
    static int time;
    static int key; //store for the binary search below
    static int position; //postion is result from binarySearch method, in the other class
    public static void main(String[] args) {
        MyArrayList<Integer> list1, list2; //create 2 arraylists, data type integer
        list1 = new MyArrayList<>(); //initiating the lists
        list2 = new MyArrayList<>();
        
        Random rand = new Random(); // randoms have to be inserted, creat object rand
        //1500 random numbers, use for loop from 0 - 1499
        for(int j = 0; j<1500; j++){
            rNum = rand.nextInt(1500); //random numbs stored in rNum
            list1.add(rNum); //intend to use for bubblesort            
            System.out.println(rNum + "");
            list2.add(j); //intend to use for binarysearch            
            System.out.println(j+ "");
            // rNum is random numbers and j is index
        }
        
        //BUBBLE SORT
        //store the times
        //bubble sort, to record times
        // time before
        System.out.println("Unsorted list is" +list1);
        time = (int) System.currentTimeMillis();
        list1.bubbleSort();
        //bubble sort runs
        //record new time
        time = (int) System.currentTimeMillis() - time;
        System.out.println("The bubble sort took " +time+" milliseconds");
        System.out.println("The integers in the list after the bubbble sort are "+list1);
        
        //BINARYSEARCH
        //key is x in other programs
        int arraySize = list2.size() - 1000; // minus 1000 is 500 as we initially put in 1500
        key = rand.nextInt(1500);
        System.out.println("Key is"+key); //print key value
        time = (int) System.currentTimeMillis(); //rec start time
        position = list2.binarySearch(key, 0, list2.size() - 1); //starts at 0 and runs to 1499 as specified above
        time = (int) System.currentTimeMillis() - time; //rec end time
        
        if (position == -1){
            System.out.println("Key not Found");
        } else {
            System.out.println("The number : " +key+ "found");
        }
        System.out.println("The recursive binary search took" +time+ " milliseconds");
    }
    
}
