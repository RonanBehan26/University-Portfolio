package mydoublylinkedlist;
        
public class Node<T> {

T element; // list element
Node<T> previous; // previous link  
Node<T> next; // successor link

public Node(T el, Node<T> p, Node<T> n){  
    element = el;
    next = n;  
    previous  = p; //please compare this file with the singly linked list node to see the differences
}

public Node(T el){  
    this(el,null,null);
}

public String toString(){
    return "<Element: " + element +">";
}

public static void main(String[] args){  
    Node<Integer> node = new Node<>(100);

node.next = new Node<Integer>(1001, node, null);

System.out.println(node.next);  
System.out.println(node.next.next);
}
}


