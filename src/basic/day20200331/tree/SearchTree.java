package basic.day20200331.tree;

import java.util.ArrayList;

public class SearchTree {
    Node root;
    ArrayList<Node> nodes = new ArrayList<>();

    public SearchTree(Node root) {
        this.root = root;
        nodes.add(root);
    }

    public void add(Node node) {
        if(this.root == null) {
            this.root = node;
            nodes.add(node);
        }else if(node != null) {
            sub_add(node, root);
        }
    }

    private void sub_add(Node node, Node current_node) {

        if (node.key == current_node.key) {
            return;
        }else if(node.key < current_node.key) {
            if (current_node.left == null) {
                current_node.left = node;
                nodes.add(node);
                return;
            }else {
                sub_add(node, current_node.left);
                return;
            }
        }else {
            if (current_node.right == null) {
                current_node.right = node;
                nodes.add(node);
                return;
            }else {
                sub_add(node, current_node.right);
                return;
            }
        }
    }
}
