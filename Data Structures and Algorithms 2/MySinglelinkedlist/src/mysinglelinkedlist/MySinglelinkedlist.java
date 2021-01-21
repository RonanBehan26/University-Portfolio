package mysinglelinkedlist;

/**
 *
 * @author dcarr
 */
public class MySinglelinkedlist<T> implements List<T> {

    private Node<T> first;

    public MySinglelinkedlist() {
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
    public void add(T e) {
        // if the list is empty
        if (isEmpty()) {
            // the new item wil be the first item
            first = new Node<>(e);
        } else {
            // we are adding at the end of the list
            // let's get to the end of the list
            Node<T> current = first;
            while (current.next != null) {
                current = current.next;
            }
            System.out.println("I am adding " + e + " after " + current);
            current.next = new Node<>(e);
        }
    }

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
    public void add(T e, int index) {
        // check if the index makes sense
        if (index < 0 || index > size() - 1) {
            throw new IndexOutOfBoundsException();
        } else if (index == 0) {
            Node<T> node = new Node(e, first);
            first = node;
        } else {
            // this is the most complex insertion
            // we need to find the node before the specified index and insert after that node
            Node<T> pred = first;
            for (int i = 0; i < index - 1; i++) {
                pred = pred.next;
            }
            pred.next = new Node<>(e, pred.next);
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
        Node<T> insertion = new Node<>(elem, first);
        first = insertion;
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
