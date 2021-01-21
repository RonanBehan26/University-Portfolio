//she will upload this
package ramyabitrees;
//main logical part

public class MyBinaryTree {
    public BTNode root;
// constructor(no arguement const - nothing in it), has same name as class
    public  MyBinaryTree(){
        root = null;
    }
    
    public BTNode myRoot(){
        return root;
    }
    public boolean isEmpty(){
        if(root == null) //initially it will say it is null then move down
            return true;
        else
            return false;
    }
    //insert into node, no return so void
    public void insertNode(BTNode startingnode, BTNode NewNode){
        if(root == null)
        {
         root = NewNode;   //if null pop this in
        }
        else 
        {
            if(NewNode.getNode() > startingnode.getNode()){
                if(startingNode.getRight() == null){
                    startingnode.setRight(NewNode);
                }
                else {
                    insertNode(startingnode.getRight(),NewNode); // just continues onto next node
                }
            }
            else if(startingNode.getLeft() == null){
                    startingnode.setLeft(NewNode);
                }
                else {
                    insertNode(startingnode.getLeft(),NewNode); // just continues onto next node
                }
            }
        else if(NewNode.getNode() == startingnode.getNode()){
                System.out.println("the node is" +startingnode.getNode()+"is already present");
                }
        }
    }
}
