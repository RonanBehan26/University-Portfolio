package mydoublylinkedlist;

public class Mydoublelinkedlist<T> implements List<T> {

    private Node<T> first;
    private Node<T> last; //added this for Double link list

    public Mydoublelinkedlist() { //same as class name 
        first = null;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        int count = 0;
        Node<T> current = first;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    @Override
    public void add(T e) {  //Changes done here in "add" for doubly linked list, please compare the entire code between the braces
        // if the list is empty
        if (isEmpty()) {
            // the new item wil be the first item
            first = new Node<T>(e, null, null);
            last = first;
        } else {
            // we are adding at the end of the list
            // let's get to the end of the list
            last.next = new Node<T>(e, last, null);
            last = last.next;
        }
    }
    //I took this from the notes during study but it seems to make sense, fired guy as opposed to ramya's notes, clarify
    //To add e to beginning of a nonempty doubly linked list:
    //first = new Node(e, null, first);  
    // first.next.prev = first

    

    public String toString() {
        Node<T> current = first;
        String value = "";
        int pos = 0;
        while (current != null) {
            value += "Position " + pos + " Element " + current.element + "\n";
            pos++;
            current = current.next;
        }
        return value;
    }

    // we want to add an element at a specific index
    @Override
    public void add(T e, int index) { //Changes done here in "add" for doubly linked list, please compare the entire code between the braces
       if (index < 0 || index > size())
throw new IndexOutOfBoundsException();
// Index is 0
if (index == 0){
// New element goes at beginning  
Node<T>  p =  first;	// Old first  
first = new Node<T>(e, null, p);
if (p != null){
p.previous = first;
}
if (last == null){  last = first;
}
return;
}
// pred will point to the predecessor of the new node.  
Node<T> pred = first;
for (int k = 1; k <= index - 1; k++) {  pred = pred.next;
}
// Splice in the new node: pred-- succ becomes pred--middle--  succ
Node<T> succ = pred.next;
Node<T> middle = new Node<T>(e, pred, succ);  pred.next = middle;
if (succ == null){
last = middle;
} else {
succ.previous = middle;
}
}

    

    @Override
    public T remove(int index) {
        if (isEmpty() || index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            // in this case we are removing the first elemented
            T element = first.element;
            first = first.next;
            return element;
        } else {
            Node<T> pred = first;
            for (int i = 0; i < index - 1; i++) {
                pred = pred.next;
            }
            T element = pred.next.element;
            pred.next = pred.next.next;
            return element;
        }
    }
@Override
    public void addFirst(T elem) {
        first = new Node<>(elem, null, first);
        first.next.previous = first;
    }

    @Override
    public void addBefore(T target, T elem) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null && !current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null && current.element.equals(target)) {
            add( elem, index);
        }
    }

    @Override
    public void addAfter(T target, T elem) {
        if (isEmpty()) {
            return;
        }
        Node<T> current = first;
        int index = 0;
        while (current != null &&!current.element.equals(target)) {
            index++;
            current = current.next;
        }
        System.out.println("index=" + index);
        System.out.println("current=" + current);
        if (current != null &&current.element.equals(target)) {
            add(elem, index+1);
        }
    }

    @Override
    public T remove(T target) {
        Node<T> current = first;
        int index = 0;
        while(current != null && !current.element.equals(target)){
            current = current.next;
            index++;
        }
        if (current != null && current.element.equals(target)){
            return remove(index);
        }
        return null;
    }
}
