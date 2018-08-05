import sci.java.person.Person;
import sci.java.person.PersonSorter;
import sci.java.person.RandomName;

import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        String nrPersons;
        nrPersons = null;

        RandomName nume = new RandomName();

        while (nrPersons == null) {
            nrPersons = JOptionPane.showInputDialog(null, "Cate Persoane doriti sa introduceti");
        }

        Person[] persoane = new Person[Integer.parseInt(nrPersons)];


        for (int i = 0; i < Integer.parseInt(nrPersons); i++) {
            persoane[i] = new Person();
            persoane[i].setFirstName(nume.randomName());
            persoane[i].setLastName(nume.randomName());
            persoane[i].setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "introduceti varsta  persoanei " + persoane[i].getFirstName() + persoane[i].lastName)));

        }
        PersonSorter sortare = new PersonSorter();

        String operatie;
        Object[] possibilities = {"boubleSort","insertSort"};
        operatie = (String) JOptionPane.showInputDialog(
                null,
                "Selectati metoda de sortare",
                "Selector",
                JOptionPane.WARNING_MESSAGE,
                null,
                possibilities,
                "boubleSort");


        if (operatie=="boubleSort" ){
            sortare.boubleSort(persoane);
        }
        else {
            sortare.insertSort(persoane);
        }
    }


}
