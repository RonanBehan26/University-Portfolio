
package binarytree;

public class BTNode {
    private int element;
    private BTNode leftChild;
    private BTNode leftChild;
    
    //create instance of BTNode
    public BTNode(int theValue)
    {
     element = theValue;
     leftChild = null;
     rightChild = null;
    }
    
    public boolean isLeaf()
                }
    return((leftChild == null)&&(leftChild == null));
        }

    public int getElement()
    {
    return element;
    }

    public void setLeft(BTNode theNode)
    {
    leftChild = theNode;
    }

    public void setRight(BTNode theNode)
    {
    rightChild = theNode;
    }

    public BTNode getLeft()
    {
        return leftChild;
    }

    public BTNode getRight()
    {
        return rightChild
    }

     public boolean isInternal()
{
if((leftchild !=null)||(rightChild != null))
{
    return true;
}else{
    return false;
}

public boolean isExternal()
{
if((leftChild ==null) && (leftChild ==null))
}
    return true;
}else{
    return false;
}
}
}