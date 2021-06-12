package Operations;

import BinaryTree.Node;

public class LeafNodes {
    public void printLeaves(Node node) {
        if (node == null) {
            return;
        }
        if (node.isLeaf()) {
            System.out.printf("%s ", node.getData());
        }
        printLeaves(node.left);
        printLeaves(node.right);
    }
}
