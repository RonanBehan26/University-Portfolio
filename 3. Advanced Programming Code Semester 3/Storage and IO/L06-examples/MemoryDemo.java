public class MemoryDemo {
//we min 1:08
    public static void main(String[] args)
            throws InterruptedException {

        Runtime r = Runtime.getRuntime();//object
        long mem1, mem2;

        String someints[] = new String[10000]; //string size 10000
        System.out.println("Total memory is: " + r.totalMemory());//check size of mem

        mem1 = r.freeMemory();
        System.out.println("Initial free memory: " + mem1); //what free mem left after string

        r.gc(); //run gc and check mem left
        Thread.sleep(1000);//rests
        mem1 = r.freeMemory();
        System.out.println("Free memory after garbage collection: " + mem1);

        for (int i = 0; i < 10000; i++) {//allocate memory
            someints[i] = i + ""; // allocate integers
        }
        mem2 = r.freeMemory();
        System.out.println("Free memory after allocation: " + mem2);
        System.out.println("Memory used by allocation: " + (mem1 - mem2));

        // discard Integers
        for (int i = 0; i < 10000; i++) {
            someints[i] = null;
        }

        r.gc(); // request garbage collection
        Thread.sleep(100);
        mem2 = r.freeMemory();
        System.out.println("Free memory after collecting discarded String: " + mem2);
    }
}
