public class MemoryAllocationNOK {

    void show() {
        System.out.println("MemoryAllocationNOK::show() called");
    }

    public static void main(String[] args) {

        MemoryAllocationNOK t; //declaration(just a label), but doesn point anywhere
        // Error here because t is not initialed
        //you could point to null, you'd be pointing to something but you'dd get an exception
        t.show(); //doesn't allow you to compile as t object that he delared, but hasn't been instantiated
    }
}
//it would be more visable on Netbeans
//look at memoryallocationOK file
//week 8 around 16min