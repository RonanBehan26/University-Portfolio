public class CreatedInside {
//w8 min 46
    String obj_name;

    public CreatedInside(String obj_name) {

        this.obj_name = obj_name;
    }

    //static, can be called
    static void show() {
        //object t1 inside method becomes unreachable when show() removed
        CreatedInside t1 = new CreatedInside("t1");
        display();
    }

    static void display() {
        //object t2 inside method becomes unreachable when display() removed
        CreatedInside t2 = new CreatedInside("t2");
    }

    public static void main(String args[]) throws Exception {
        // calling show()
        show(); //once finished this, the poonters will disappear, so eligible for gc

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
