package Operations;

import BinaryTree.Node;

public class InorderTransversal {
    public void withRecursion(Node node) {
        if (node == null) {
            return;
        }
        withRecursion(node.left);
        System.out.printf("%s ", node.getData());
        withRecursion(node.right);
    }

}
