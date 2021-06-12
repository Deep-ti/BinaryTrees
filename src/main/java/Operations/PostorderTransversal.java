package Operations;

import BinaryTree.Node;

public class PostorderTransversal {
    public void postOrderTransversalWithRecursion(Node node){
        if(node == null){
            return;
        }
        postOrderTransversalWithRecursion(node.left);
        postOrderTransversalWithRecursion(node.right);
        System.out.printf("%s ",node.getData());
    }
}
