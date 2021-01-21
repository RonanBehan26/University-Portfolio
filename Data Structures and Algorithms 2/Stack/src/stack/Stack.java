
package stack;
    
public class Stack {
    int stack[] = new int[5]; //LIFO, all stacks are arrays, this of size 5
    int top = 0; //we need reference of what is on top, 0 by deault
    public void push(int data){
        if(top==5)// data is something which comes through the runner
        {
            System.out.print("Stack is full");
        }
        else{
        stack[top]=data; 
        top++;
        }
    }
    
    public int pop(){
        int data;
        top--; // will minus the top when you get that data (take the data off the top)
        data = stack[top];
        stack[top]=0; // the top becomes 0
        return data; // this returns that the top is 0
    }
    
    public int peek(){
        int data;
        data = stack[top]; // return the value on top, if I pop once: data = stack[top - 1]; if I pop twice: data = stack[top - 2];
        return data;
    }
    public int size(){
     return top;   
    }
    // check if empty or not
    public boolean isEmpty(){ //can write anything for isEmpty
     return top<=0; // if this is true it will return true, always this  
    }
    
    public void display(){ // data is something which comes through the runner
        for(int n: stack){
        System.out.println(n+"");
    }
        
    }
}
  