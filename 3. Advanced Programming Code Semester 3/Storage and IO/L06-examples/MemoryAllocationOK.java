public class MemoryAllocationOK {
    // class contents

    void show() {
        System.out.println("MemoryAllocationOK::show() called");
    }

    public static void main(String[] args) {
        //all objects are dynamically allocated
        MemoryAllocationOK t = new MemoryAllocationOK();//allocate the space and all is well
        //therefore, you need to instantiate an object to use it
        t.show(); // No error 
    }
}

//week 8 around 12:00
