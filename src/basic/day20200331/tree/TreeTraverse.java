package basic.day20200331.tree;

import java.util.ArrayList;

public class TreeTraverse {

    public static ArrayList<Integer> preTra(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        preSearch(node, list);
        return list;
    }

    private static void preSearch(Node node, ArrayList<Integer> list){
        Node current_node = node;
        if (current_node == null){
            return;
        }else {
            list.add(current_node.key);
        }
        if (current_node.left != null) {
            preSearch(current_node.left, list);
        }
        if (current_node.right != null) {
            preSearch(current_node.right, list);
        }
        return ;
    }

    public static ArrayList<Integer> midTra(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        midSearch(node, list);
        return list;
    }

    private static void midSearch(Node node, ArrayList<Integer> list) {
        Node current_node = node;
        if (current_node == null){
            return;
        }
        if(current_node.left == null) {
            list.add(current_node.key);
            return;
        }

        midSearch(current_node.left, list);
        list.add(current_node.key);

        if(current_node.right == null) {
            return;
        }
        midSearch(current_node.right, list);
    }

    public static ArrayList<Integer> lastTra(Node node) {
        ArrayList<Integer> list = new ArrayList<>();
        lastSearch(node, list);
        return list;
    }

    private static void lastSearch(Node node, ArrayList<Integer> list) {
        Node current_node = node;
        if (current_node == null) {
            return;
        }
        if (current_node.left == null && current_node.right == null) {
            list.add(current_node.key);
            return;
        }
        if (current_node.left != null) {
            lastSearch(current_node.left, list);
        }
        if (current_node.right != null) {
            lastSearch(current_node.right, list);
        }
        list.add(current_node.key);

    }

}


