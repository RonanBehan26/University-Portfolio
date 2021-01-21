
package stack;

public class Runner {
    public static void main(String[] args){
        Stack nums = new Stack();
        System.out.println("is the stack empty "+nums.isEmpty());
        nums.push(5);
        nums.push(10);
        nums.push(15);
        nums.push(20);
        nums.push(25);
        nums.push(30);
        System.out.println(" after push");
        nums.display(); //nums.display(); because she called it in the other class and she can just put this like this now
        System.out.println("Popped "+nums.pop());
        System.out.println("After Popping");
        nums.display();
        System.out.println("Peeking :"+nums.peek());
        
        System.out.println("size of stack "+nums.size());
        System.out.println("stack is empty "+nums.isEmpty());
        nums.display();        
}    
}
