/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistexample;
import java.util.*;

/**
 *
 * @author gward
 */
public class TestArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // declare an ArrayList object
        ArrayList<Person> list;

        // create an ArrayList object
        list = new ArrayList<Person>();

        //Task1: create and add three Person type elements to the list. Each element will be added at the end of the list
        //put your code here
        Person p1,p2,p3;
        p1 = new Person("John", 20);
        p2 = new Person("Paul", 10);
        p3 = new Person("Chris", 30);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);

        //Task2:print the elements of the ArrayList using both toString() method and printPerson() method part of the Person class
       // note that printPerson() prints info regarding ONE person
        //Assess the difference in printing
        //put your code here
        System.out.println("Printing..."+list.toString());
        int i;
        for(i = 0;i<list.size();i++)
        {
            Person onePerson;
            onePerson = list.get(i);
            System.out.println(onePerson.printPerson());

        }

        // Task3:add a Person object ( a new person) on the second position of the ArrayList object
        //put your code here
         Person p4;
         p4 = new Person("Alex", 100);
         list.add(1,p4);

        //Task4:print the elements of the ArrayList USING ITERATOR object to check if the new person was added
        //put your code here
          System.out.println("Printing again after adding an extra person on potsion 2");
         Iterator iter;
         iter = list.iterator();
         while(iter.hasNext())
         {
             Person onePerson;
            onePerson = (Person)iter.next();
            System.out.println(onePerson.printPerson());
         }

        //Task5:remove the element( person) on postion 1
        //put your code here
         list.remove(0);

        //Task6:print the elements of the ArrayList to check if the person was removed
       //put your code here
         System.out.println("Printing again after removing the person on position 1");
        
         iter = list.iterator();
         while(iter.hasNext())
         {
             Person onePerson;
            onePerson = (Person)iter.next();
            System.out.println(onePerson.printPerson());
         }


        //Task7:check if the person with a given name exists. If so, print its position in the list
        //put your code here
         
         // We are looking for person Chris
         String searchPerson = "Chris";
         int j;
        for(j = 0;j<list.size();j++)
        {
            Person onePerson;
            onePerson = list.get(j);
            if(onePerson.getName() ==searchPerson)
            {
                System.out.println("Found "+searchPerson+ "  on position "+j);
                break;
            }
        }
        if( j == list.size())
            System.out.println("NOT Found "+searchPerson);
            
              
    }
}
