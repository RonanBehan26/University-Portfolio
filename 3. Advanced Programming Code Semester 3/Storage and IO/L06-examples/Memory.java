public class Memory {//min 13 vid 8

    static private int a; // java already does initialization eg int default is 0

    public static void main(String[] args) {
        Object obj = new Object(); //initialize an object
        Memory mem = new Memory(); //initialize the  memory
        System.out.println("First time: " + a); //0
        mem.foo(obj); //method, referances the obj above, then jumps down to line 13, 14, 15
        System.out.println("Second time: " + a); //2 as the method below
    }

    private void foo(Object param) {//foo receives an object as a para
        String str = param.toString(); //turns the object into a string
        System.out.println(str);
        a = 2; //assign val od 2 to a
        System.out.println("Third time: " + a);//here and back to line 10
    }
}
