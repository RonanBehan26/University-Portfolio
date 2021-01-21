package queueramya;
import java.util.*;

public class QueueRamya {
int front, last, size;
int capacity;
int array[]'

public QueueRamya(int capacity){ //constructor
    this.capacity=capacity;
    first=this.size=0; // starts from 0
    last=capacity - 1; // the last item
    array = new int[this.capacity};]
}

boolean isEmpty(Queue queue){ //object
    return(queue.size==0);
}
boolean isFull(Queue queue){
return(queue.size==queue.capacity);
}

public void enqueue(int item) //item is a placeholder for like 10 or whatever it is
}
 if(isFull(this))
return;
this.last=(this.last + 1)%this.capacity;
this.array[this.last]=item;
this.size=this.size+1;
System.out.println("item"+item+"added to the queue");
}

//to remove, no arg as you are removing
public int dequeue(){
if(isEmpty(this))
return Integer.MIN_VALUE; //MIN_VALUE built in in java
int item=this.array[this.first];
this.first=(this.first+1)%this.capacity;
this.size=this.size-1;
return item; 
} 

public int first(){
if(isEmpty(this))
return Integer.MIN_VALUE;

return this.array[this.first];
}

public int last(){
if(isEmpty(this))
return Integer.MIN_VALUE;
return this.array[this.last];
}

//she asked me to write this, my guess, she will upload correct stuff, said this is almost correct
public void dequeue(){ // 
        for(int n: queue){
        System.out.println(n+"");
    }
}
