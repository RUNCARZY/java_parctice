package basic.day20200331.tree;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Node> nodes = new ArrayList<>();
        int[] nums = {50, 32, 8, 2345, 243, 5, 65, 345};
        SearchTree tree = new SearchTree(new Node(60));
        for (int num : nums) {
            nodes.add(new Node(num));
        }
        for (Node node : nodes) {
            tree.add(node);
        }
        System.out.println(TreeTraverse.preTra(tree.root));
        System.out.println(TreeTraverse.midTra(tree.root));
        System.out.println(TreeTraverse.lastTra(tree.root));
    }
}

