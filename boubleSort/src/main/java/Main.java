import sci.java.*;


import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        String nrCreaturi = null;

        RandomName nume = new RandomName();


        while (nrCreaturi == null) {
            nrCreaturi = JOptionPane.showInputDialog(null, "Cate Persoane doriti sa introduceti");
        }
        Person[] persoane = new Person[Integer.parseInt(nrCreaturi)];
        for (int i = 0; i < Integer.parseInt(nrCreaturi); i++) {
            persoane[i] = new Person();
            persoane[i].setFirstName(nume.randomName());
            persoane[i].setLastName(nume.randomName());
            persoane[i].setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "introduceti varsta  persoanei " + persoane[i].getFirstName() + persoane[i].getLastName())));
        }


        //selectam metoda de sortare
        String operatie;
        Object[] possibilities = {"boubleSort", "insertSort"};
        operatie = (String) JOptionPane.showInputDialog(null, "Selectati metoda de sortare", "Selector", JOptionPane.WARNING_MESSAGE, null,
                possibilities, "boubleSort");

        //sortam in functie de alegere

        SortingMethods sortare = new Sorter();
        Main forPrintingMethod = new Main();
        if (operatie == "boubleSort") {
            sortare.boubleSort(persoane);
            forPrintingMethod.printSortedList(persoane);
         } else if (operatie == "insertSort") {
            sortare.insertSort(persoane);
            forPrintingMethod.printSortedList(persoane);
        }
        System.out.println();

    }



    void printSortedList(Person[] listaPersoane) {


        for (int i = 0; i < listaPersoane.length; i++) {

            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());
        }
    }

}
