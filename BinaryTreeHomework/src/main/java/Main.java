import binary.tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<Integer>();
        lista.add(5);
        lista.add(12);
        lista.add(3);
        lista.add(1);
        lista.add(11);
        lista.add(9);
        lista.add(29);
        lista.add(7);
        lista.add(50);
        lista.add(18);
        lista.add(33);
        System.out.println(lista);

        BinaryTree bin = new BinaryTree();
        bin.createNodeList(lista);



    }

}
