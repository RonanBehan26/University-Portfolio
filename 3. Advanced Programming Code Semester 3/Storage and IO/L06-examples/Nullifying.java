public class Nullifying {
//min 32 week 8
    String obj_name;

    public Nullifying(String obj_name) {
        this.obj_name = obj_name;
    }
    //constructor, gets value for the string above, assigns it

    public static void main(String args[]) throws Exception {//initialize the object
        Nullifying t1 = new Nullifying("t1");//nullify t1, this obj_name is only on intellij, automatic

        /* t1 being used for some purpose in program */
        t1 = null; //assign null, garbage collect is coming
        // calling garbage collector
        System.gc();//not guaranteed but most likely will
        Thread.sleep(100); //wait 100ml secs before closing
    }

    @Override
    /* Overriding finalize method to check which object
     is garbage collected */
    protected void finalize() throws Throwable { //gc always runs finalize, we are overriding
        // will print name of object
        System.out.println(this.obj_name + " successfully garbage collected");
    }
}