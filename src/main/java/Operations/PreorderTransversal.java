package Operations;

import BinaryTree.Node;

import java.util.Stack;

public class PreorderTransversal {
    public void withRecursion(Node node) {
        if (node == null) {
            return;
        }
        System.out.printf("%s ", node.getData());
        withRecursion(node.left);
        withRecursion(node.right);
    }

    public void withoutRecursion(Node root) {
        Stack<Node> nodes = new Stack<>();
        nodes.push(root);
        while (!nodes.isEmpty()) {
            Node current = nodes.pop();
            System.out.printf("%s ", current.getData());
            if (current.right != null) {
                nodes.push(current.right);
            }
            if (current.left != null) {
                nodes.push(current.left);
            }
        }

    }
}
