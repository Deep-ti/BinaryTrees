import BinaryTree.BinaryTree;
import BinaryTree.Node;
import Operations.InorderTransversal;
import Operations.LeafNodes;
import Operations.PostorderTransversal;
import Operations.PreorderTransversal;

public class Main {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node node = new Node(1);
        node.left = new Node(2);
        node.right = new Node(3);
        node.left.left = new Node(4);
        node.left.right = new Node(5);
        node.right.left = new Node(6);
        node.right.right = new Node(7);
        binaryTree.setRoot(node);
        System.out.println("################################START################################");
        System.out.println("Problem 1");
        System.out.println("How do you perform preorder traversal in a given binary tree?");
        PreorderTransversal preorderTransversal = new PreorderTransversal();
        preorderTransversal.withRecursion(binaryTree.getRoot());
        System.out.println();
        System.out.println("################################################################");
        System.out.println("Problem 2");
        System.out.println("How do you perform preorder traversal in a given binary tree without recursion?");
        preorderTransversal.withoutRecursion(binaryTree.getRoot());
        System.out.println();
        System.out.println("################################################################");
        System.out.println("Problem 3");
        System.out.println("How do you perform an inorder traversal in a given binary tree?");
        InorderTransversal inorderTransversal = new InorderTransversal();
        inorderTransversal.withRecursion(binaryTree.getRoot());
        System.out.println();
        System.out.println("################################################################");
        System.out.println("Problem 4");
        System.out.println("How do you print all nodes of a given binary tree using postorder traversal? ");
        PostorderTransversal postorderTransversal = new PostorderTransversal();
        postorderTransversal.postOrderTransversalWithRecursion(binaryTree.getRoot());
        System.out.println();
        System.out.println("################################################################");
        System.out.println("Problem 5");
        System.out.println("How are all leaves of a binary search tree printed? ");
        LeafNodes leafNodes = new LeafNodes();
        leafNodes.printLeaves(binaryTree.getRoot());
        System.out.println();
        System.out.println("################################END################################");
    }
}
