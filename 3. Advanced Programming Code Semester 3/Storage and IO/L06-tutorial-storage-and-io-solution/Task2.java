public class Task2 {
//vid 9 16 min
    int a;
    boolean b;
    short s;
    float f;
    double d;

    //2 constructors
    public Task2() {
    }

    public Task2(int _a, boolean _b, short _s, float _f, double _d) { //sets the vars with values
        this.a = _a;
        this.b = _b;
        this.s = _s;
        this.f = _f;
        this.d = _d;
    }

    @Override
    public String toString() {

        return this.a + " " + this.b + " " + this.s + " " + this.f + " " + this.d;
    }
    //instantiates 2 task 2s
    public static void main(String args[]){
        Task2 s1 = new Task2();//instantiate without any values
        System.out.println(s1.toString()); //you will see the default values
        
        Task2 s2 = new Task2(10, true, (short) 10000, (float) 12.3, 13.13); //remember intellij does the grey
        System.out.println(s2.toString());//instantiate and passing values
    }
}
