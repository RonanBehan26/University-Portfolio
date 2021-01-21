public class AnonymousObject {

    String obj_name;

    public AnonymousObject(String obj_name) {
        this.obj_name = obj_name;
    }

    public static void main(String args[]) throws Exception {
        //anonymous object without reference id
        new AnonymousObject("t1");

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
