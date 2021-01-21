public class Reassigning {

    String obj_name;
//w8 min 43
    //not sure if the code actually works, he just skipped over it, but it's pretty straight forward
    public Reassigning(String obj_name) {
        this.obj_name = obj_name;
    }

    public static void main(String args[]) throws Exception {
        Reassigning t1 = new Reassigning("t1"); // grey is from intellij
        Reassigning t2 = new Reassigning("t2");

        //t1 now referred to t2
        t1 = t2;

        // calling garbage collector
        System.gc();
        Thread.sleep(100);
    }

    @Override
    /* Overriding finalize method to check which object
     is garbage collected */
    protected void finalize() throws Throwable {
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}
