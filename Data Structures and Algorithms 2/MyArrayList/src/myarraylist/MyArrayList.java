//RAMYA HELP FOR HIS CA PREP PAPER
package myarraylist;

import java.util.*;

//give the type parameter - <ElemType> <can put anything in here>
public class MyArrayList<ElemType> extends ArrayList<ElemType> {
    //create function for bubblesort
    
    //bubble sort start
    public void bubbleSort(){
        int i,j;
        Comparable elemAtJ, elemAtJPlus;
        
        for(i = 0; i<size(); i++){
            for(j = 0; j <size() -1 - i; j++){
                elemAtJ = (Comparable) get(j);
                elemAtJPlus = (Comparable) get(j + 1);
                
                if (elemAtJ.compareTo(elemAtJPlus) > 0){
                    swap(j,j+1);
                }
            }
        }
    }

//create function for swap

    public void swap(int pos1, int pos2){
        ElemType objPos1 = get(pos1);
        remove(pos1);
        add(pos2,objPos1);
    }
    //bubble sort end

    //binary search
    int binarySearch(ElemType key, int start, int end){
        int middle = 0;
        int result; //result of the execution
        middle = (start +end) /2;
        //middle  = start +(end - start) /2;

        if (((Comparable) get(middle)).compareTo((Comparable) key) == 0){
            result = middle;

        } else if (start == end) {
            result = -1; // trigger to help print in the other class
        } else {
            if(((Comparable) get(middle)).compareTo((Comparable) key) >0) { //if key value greater than other value
                result = binarySearch(key, start, middle - 1); //start is left in the other program
        } else {
            result = binarySearch(key, middle + 1, end);
        }    
    }
    return result;
    }
    
}
