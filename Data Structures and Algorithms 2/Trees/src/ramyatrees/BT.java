
package ramyatrees;

public class BT {
    //first initialize my node, class name is myNode
    public Mynode root;
    
    //contructor - to initialize
    public BT(){
        root = null;
    }
    //now method to return root value
    public Mynode TheRoot(){
        return root;
    }
    
    //now check if there is anything in the root
    public boolean isEmpty(){
        if(root = null){
            return true;
        }
        else {
            return false;
    }
}
    //setter - check if empty, r or l, which is greater, if something is present
    // to the right
    public void Insert(Mynode sNode, Mynode Nnode){
     if (root = null){
         root = Nnode;
    }else if(Nnode.getNode() > sNode.getNode()){
         if(sNode.getRight()==null){
             sNode.setsetRight(Nnode);
         } else {
             Insert(sNode.getRight(), Nnode);
         }
    }else if (Nnode.getNode() < sNode.getNode()){
         if(sNode.getRight()== null){
             sNode.setLeft(Nnode);
         } else {
             Insert(sNode.getLeft(), Nnode);
         }
        }
             
    }