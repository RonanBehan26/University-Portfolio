package examples;

public class StackException extends Exception {

    protected String msg;
    
    public StackException() {
    }

    public StackException(String msg) {
        super(msg);
        this.msg = msg;
    }
    
    public String getStackMsg() {
        return this.msg;
    }
}