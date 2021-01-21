
package ramyatrees;
//nodes act differently here as tree is a different structure
public class MyNode {
    private int node;
    private Mynode r_child;
    private Mynode l_child;
    
    //parameteriszed - constructor paramethers being passed in 
    private Mynode (int_value){
        node = value;
        r_child = null;
        r_child = null;
    }
    
    //get method
    public int getNode(){}
    return node;
    }

    //is the values in the the childs, null or not
    public boolean isChild(){
    return((l_child == null) && (r_child == null))
}

//set method - left and right
public void setLeft(Mynode theNode){
    1_child = theNode;
}
public void setRight(Mynode theNode){
    r_child = theNode;
}

//get methods
public Mynode getLeft(){
return l_child;
}

public Mynode getRight(){
return r_child;
}
}