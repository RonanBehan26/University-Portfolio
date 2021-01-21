package week2;

public interface List<T> {

    void add(T e);

    // we want to add an element at a specific index
    void add(T e, int index);

    boolean isEmpty();

 //   T remove(int index);

    int size();
    
        public void addFirst(T elem);

    /**
     * This method allows us to remove an element by index
     *
     * @param index the index to remove from
     * @return the element which has been removed from the index specified in
     * the input
     */
    public T remove(int index);

    // existing methods omitted
    /**
     * This method adds an element to the list in the position  previous to
     * the first occurrence of the the target  element
     *
     * @param target
     * @param elem
*
     */
    public void addBefore(T target, T elem);

    /**
     * This method adds an element to the list in the position after to the
     * first occurrence of the the target element
     *
     * @param target
     * @param elem
*
     */
    public void addAfter(T target, T elem);

    /**
     * This method removes the first occurance of the target from the list
     *
     * @param target
     * @return 
*
     */
    public T remove(T target);
    
}
