package mysinglelinkedlist;

/**
 *
 * @author dcarr
 */
public class Node<T> {
    
    // this is the piece of data stored in the node
    T element;
    // this is the node which comes after this one in the list
    Node<T> next;
    
    public Node(T el, Node<T> n){
        this.element = el;
        this.next = n;
    }
    
    public Node(T el){
        this(el, null);
    }
    
    public String toString(){
        return "<Element: " + element + ">";
    }
    
    public static void main(String[] args) {
        Node<String> first = new Node<>("First String");
        first.next = new Node<>("Second String");
        
      //  System.out.println("first = " + first);
    System.out.println(first); 
    System.out.println(first.next);

    }
    
}

