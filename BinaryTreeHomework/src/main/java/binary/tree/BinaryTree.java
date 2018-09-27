package binary.tree;

import java.util.ArrayList;
import java.util.List;


public class BinaryTree<E extends Comparable<E>> implements Comparable<E> {
    List<Node> nodeList = new ArrayList<Node>();
    private Node nod;
    private E value;
    private List<E> list = new ArrayList<E>();

    public BinaryTree() {
    }

    public void add(E i) {
        list.add(i);
    }

    public void createNodeList() {
        Node rootNod = new Node(list.get(0));
        nodeList.add(rootNod);
        for (int i = 1; i < list.size(); i++) {
            createNode(list.get(i), rootNod);
        }
        for (Node nodes : nodeList) {
            nodes.printNode();
            //      System.out.println(nodes);

        }
        System.out.println("Sorted node :");
        traverseInOrder(rootNod);

    }

    // we recevei root node and the first intem from the list
    private <E extends Comparable> void createNode(E integer, Node givenNode) {

        // if value from list is bigger than root
        if (integer.compareTo(givenNode.getValue()) > 0) {
            //if root right possition is empty then we can create a node and set the right position of the initial node
            if (givenNode.getRightValue() == null) {
                nod = new Node(integer);
                givenNode.setRightValue(nod);
                nodeList.add(nod);
            } else {
                //if the right side of the initial node is not empty , we call again this function but changing root = right side node
                createNode(integer, givenNode.getRightValue());
            }
        }
        // if value from list is bigger than root
        if (integer.compareTo(givenNode.getValue()) < 0) {
            //if root left possition is empty then we can create a node and set the left position of the initial node
            if (givenNode.getLeftValue() == null) {
                nod = new Node(integer);
                givenNode.setLeftValue(nod);
                nodeList.add(nod);
            }
            //if the left side of the initial node is not empty , we call again this function but changing root = side side node
            else {
                createNode(integer, givenNode.getLeftValue());
            }
        }
    }

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.getLeftValue());
            System.out.print(" " + node.getValue());
            traverseInOrder(node.getRightValue());
        }
    }


    public int compareTo(E o) {
        return nod.getValue().compareTo(o);
    }


}

