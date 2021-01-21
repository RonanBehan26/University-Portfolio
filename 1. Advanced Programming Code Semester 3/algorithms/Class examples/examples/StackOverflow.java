package examples;

public class StackOverflow extends StackException {

    public StackOverflow() {
        this.msg = "Overflow";
    }

    public StackOverflow(String msg) {
        super(msg);
    }
}
