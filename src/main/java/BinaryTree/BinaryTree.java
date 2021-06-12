package BinaryTree;

import java.util.Stack;

public class BinaryTree {
    private Node root;
    public BinaryTree(){
        this.root = null;
    }
    public void setRoot(Node root){
        this.root=root;
    }
    public Node getRoot(){
        return this.root;
    }
    public boolean isEmpty(){
        return null == root;
    }
    public int size() {
        Node current = this.root;
        int size = 0;
        Stack<Node> stack = new Stack<>();
        while (!stack.isEmpty() || current != null) {
            if (current != null) {
                stack.push(current);
                current = current.left;
            } else {
                size++;
                current = stack.pop();
                current = current.right;
            }
        }
        return size;

    }
    public void clear() {
        root = null;
    }
}