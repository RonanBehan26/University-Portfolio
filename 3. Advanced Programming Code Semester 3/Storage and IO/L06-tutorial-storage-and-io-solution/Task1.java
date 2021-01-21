import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Task1 {
    //start of week 9 vid
    List<Integer> list;

    public Task1(int n) { //object called task,
        Random r = new Random();

        this.list = new ArrayList();// 1 contructor for task
        for (int i = 0; i < n; i++) { // fills a list with ints, random
            this.list.add(i, r.nextInt());
        }
    }

    public static void main(String args[]) {
        long mem;
        List<Task1> v = new ArrayList();//instanitiate an array of task 1 objects
        Runtime r = Runtime.getRuntime();//capture the runtime

        while (true) {//true, run indefinately
            try {
                Task1 x = new Problem1(100000000);//task with 100 million elements (ints values)
                v.add(x);//add them into the vector, vector pointing to all the objects,
            } catch (OutOfMemoryError e) {//memory will fill up so try catch it
                mem = r.freeMemory(); //see how much free memory
                System.out.println("Free memory before garbage collection: " + mem);
                v = new ArrayList();//nullify vector v, all objects in this then are unreferanced
                System.gc();//calls the gc, signal, mght not run
                mem = r.freeMemory(); //see how much free memory - see if worked
                System.out.println("Free memory after garbage collection: " + mem);
            }
        }
    }
}
