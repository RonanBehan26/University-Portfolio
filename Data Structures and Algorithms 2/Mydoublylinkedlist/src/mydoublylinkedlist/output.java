package mydoublylinkedlist;


public class output {

    public static void main(String[] args) {

        List<String> list = new Mydoublelinkedlist<>();
            list.add("Ann");
            list.add("Bebhinn");
            list.add("Cathal");
            System.out.println("The elements are");
            System.out.println(list); // This would give out Ann[0],Bebhinn[1], Cathal[2]
            
            
            System.out.println("After adding Ronan before Bebhinn and adding Jack after Ann");
            list.addBefore("Bebhinn", "Ronan");
            list.addAfter("Ann", "Jack");
            System.out.println(list); // This would give Ann[0],Jack[1],Ronan[2],Bebhinn[3],Cathal[4]
            
            System.out.println("After removing item on index place 2");
            list.remove(2);
            System.out.println(list);  // This would give Ann[0],Jack[1],Bebhinn[2],Cathal[3]
            
            
            System.out.println("After adding David at index place 1");
            list.add("David",1 );
            System.out.println(list); // This would give Ann[0],David[1],Jack[2],Bebhinn[3],Cathal[4]
             }
    
}