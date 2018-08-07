import sci.java.person.Person;
import sci.java.person.PersonSorter;
import sci.java.person.RandomName;
import sci.java.person.SortingMethods;

import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        String nrPersons;
        nrPersons = null;

        RandomName nume = new RandomName();

        //citim numarul de persoane pentru sortat
        while (nrPersons == null) {
            nrPersons = JOptionPane.showInputDialog(null, "Cate Persoane doriti sa introduceti");
        }

        Person[] persoane = new Person[Integer.parseInt(nrPersons)];

        //generam automat firsn name si last name si citim age
        for (int i = 0; i < Integer.parseInt(nrPersons); i++) {
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

        SortingMethods sortare = new PersonSorter();
        if (operatie == "boubleSort") {
            sortare.boubleSort(persoane);
            sortList(persoane);
        } else if (operatie == "insertSort") {
            sortare.insertSort(persoane);
            sortList(persoane);
        }
    }
    static  void sortList(Person[] listaPersoane) {


        for (int i = 0; i < listaPersoane.length; i++) {

            System.out.printf("" + listaPersoane[i].getFirstName());
            System.out.printf("" + listaPersoane[i].getLastName());
            System.out.println("" + listaPersoane[i].getAge());
        }
    }

}
