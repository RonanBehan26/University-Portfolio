//she will upload this
package ramyabitrees;

public class BTNode {
    //start with creation of node
    private int Node;
    private BTNode leftleaf; //lefleaf + rightleaf are nodes
    private BTNode rightleaf;
    
    //create a parameterized constructor (one with stuff in it), which creates a new instance of BTNode
    //(Con is used when you want to initialise)
    public BTNode(int value){ 
       node = value; 
       leftleaf = null;
       rightleaf = null;
    }
    //getter
    public int getNode(){ //not setting so leave blank
        return node;
    }
    //check and return if lef and right are null
    public boolean isChild(){
     return(leftleaf == null) && (rightleaf == null));   
    }
    //set
    public void  setLeft(BTNode myNode){ //BTNode is int here
    leftleaf = myNode;
    }
    public void  setRight(BTNode myNode){ //theNode in both as they are private
    rightleaf = myNode;
    }
    //as BTNode was declared int above, it's int here
    public BTNode getLeft(){
        return leftLeaf;
    }
    public BTNode getRight(){
        return rightLeaf;
    }
// --------------- basics for the binary tree ---------------
    
