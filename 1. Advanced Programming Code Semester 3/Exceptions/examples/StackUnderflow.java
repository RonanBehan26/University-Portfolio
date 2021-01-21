package examples;

public class StackUnderflow extends StackException {
    public StackUnderflow() {
        this.msg = "Underflow";
    }

    public StackUnderflow(String msg) {
        super(msg);
    }
}