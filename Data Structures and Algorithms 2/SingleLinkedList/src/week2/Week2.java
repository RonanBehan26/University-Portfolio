package week2;

import java.util.Scanner;

public class Week2 {

    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            
            list.addBefore("B", "B-");
            list.addAfter("A", "A+");
            list.remove(2);
           
            list.add("D",1 );
            System.out.println(list);
             }
    
}
