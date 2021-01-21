package queueramya; // clas where she does the methods

public class Driver {
    
    public static void main(String[]args){
        
        QueueRamya queue = new QUEUERamya(700);
        queue.enqueue(10);
        queue.enqueue(11);
        queue.enqueue(12);
        queue.enqueue(17);
        queue.enqueue(24);
        
        System.out.println("I am dequeueing the 1st item which was added"+queue.dequeue());
        queue.dequeue(); //should also work if you create a method
        System.out.println("1st el in q is "+queue.first());
        System.out.println("last el in q is "+queue.last());
        
    }
    
}
