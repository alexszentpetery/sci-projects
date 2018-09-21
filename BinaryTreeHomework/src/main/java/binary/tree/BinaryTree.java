package binary.tree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree {
    Node nod;
    List<Node> nodeList = new ArrayList<Node>();

    public BinaryTree() {
    }

    public void createNodeList(List<Integer> lista) {
        Node rootNod = new Node(lista.get(0));
        nodeList.add(rootNod);
        for (int i = 1; i < lista.size(); i++) {
            createNode(lista.get(i), rootNod);
        }
        for (Node nodes : nodeList) {
            nodes.printNode();
        }
    }

    // we recevei root node and the first intem from the list
    private void createNode(Integer integer, Node givenNode) {
        // if value from list is bigger than root
        if (integer > givenNode.getValue()) {
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
        if (integer < givenNode.getValue()) {
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
}

