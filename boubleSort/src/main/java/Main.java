import sci.java.person.Person;
import sci.java.person.PersonSorter;

import javax.swing.*;

public class Main {


    public static void main(String[] args) {
        String varstaTemporar;
        String nrPersons;
        nrPersons = null;
        while (nrPersons == null) {

            nrPersons = JOptionPane.showInputDialog(null, "Cate Persoane doriti sa introduceti");
        }

        Person[] persoane = new Person[Integer.parseInt(nrPersons)];


        for (int i = 0; i < Integer.parseInt(nrPersons); i++) {
            persoane[i] = new Person();
         //   persoane[i].setFirstName(JOptionPane.showInputDialog(null, "Introduceti numele de familie P" + i));
         //   persoane[i].setLastName(JOptionPane.showInputDialog(null, "Introduceti numele de botez P" + i));
            varstaTemporar = JOptionPane.showInputDialog(null, "introduceti varsta P" + i);
            persoane[i].setAge(Integer.parseInt(varstaTemporar));

        }
        PersonSorter sortare = new PersonSorter();
                sortare.personSorter(persoane);
/*
        for (int i = 0; i < Integer.parseInt(nrPersons); i++) {

            System.out.println(persoane[i].getFirstName());
            System.out.println(persoane[i].getLastName());
            System.out.println(persoane[i].getAge());
        }
 */
    }


}
