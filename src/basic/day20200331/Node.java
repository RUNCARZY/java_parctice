package basic.day20200331;

public class Node {
    Node left;
    Node right;
    int key;

    public Node() {
    }

    public Node(Node left, Node right, int key) {
        this.left = left;
        this.right = right;
        this.key = key;
    }

    public Node(int key) {
        this.key = key;
    }

}
