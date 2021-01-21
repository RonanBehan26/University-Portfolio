/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problems;

/**
 *
 * @author LNardin
 */
public class TooManyStuffException extends Exception { //this extends exception - an exception class

    String msg = "Too many stuff!"; // defining what is message

    public TooManyStuffException() { //empty constructor
    }

    public TooManyStuffException(String msg) { //receives a string as a parameter
        super(msg); //inform the constructor of the exception class
        this.msg = msg; //then store it in a local variable called msg
    }

    public String getTooManyMessages() { //method inside the exception to return the message, msg defined above

        return this.msg;
    }
}
