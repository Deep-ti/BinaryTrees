package BinaryTree;

public class Node {
    private int data;
    public Node left;
    public Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
    public int getData(){
       return this.data;
    }

    public boolean isLeaf() {
        return left == null ? right == null : false;
    }
}
