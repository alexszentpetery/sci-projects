import binary.tree.BinaryTree;
import binary.tree.Node;
import binary.tree.Person;

import java.util.ArrayList;
import java.util.List;

public class Main extends Thread {

    public static void main(String[] args) {
        BinaryTree treeList = new BinaryTree();

//        treeList.add("f");
//        treeList.add("d");
//        treeList.add("b");
//        treeList.add("a");
//        treeList.add("t");
//        treeList.add("u");
//        treeList.add("m");
//        treeList.add("n");
//        treeList.add("e");
//        treeList.add("g");
//        treeList.add("r");
//        treeList.add("o");
//
//        treeList.add(5);
//        treeList.add(12);
//        treeList.add(3);
//        treeList.add(1);
//        treeList.add(11);
//        treeList.add(9);
//        treeList.add(29);
//        treeList.add(7);
//        treeList.add(50);
//        treeList.add(18);
//        treeList.add(33);
//        treeList.add(4);
//        treeList.createNodeList();
        Person alex = new Person("alex",25);
        Person ionut = new Person("ionut",2);
        Person ilie = new Person("ilie",27);
        Person misu = new Person("misu",26);

        treeList.add(alex);
        treeList.add(ionut);
        treeList.add(ilie);
        treeList.add(misu);

        treeList.createNodeList();
    }

}
