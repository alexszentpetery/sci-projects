import sci.java.person.Person;
import sci.java.person.PersonSorter;
import sci.java.person.RandomName;

import javax.swing.*;


public class Main {


    public static void main(String[] args) {
        String nrPersons;
        nrPersons = null;
        RandomName nume = new RandomName();
        // folosesc while pentru a evita java null pointer exception
        while (nrPersons == null) {
            nrPersons = JOptionPane.showInputDialog(null, "Cate Persoane doriti sa introduceti");
        }

        Person[] persoane = new Person[Integer.parseInt(nrPersons)];


        for (int i = 0; i < Integer.parseInt(nrPersons); i++) {
            persoane[i] = new Person();
            /* comentam citire nume de familie si de botez pentru a lucra mai repede
             deasemenea ar trebui sa verific ca nu se introduce o variabila de tip String = null , usor cu un while */

            //persoane[i].setFirstName(JOptionPane.showInputDialog(null, "Introduceti numele de familie P" + i));
            //persoane[i].setLastName(JOptionPane.showInputDialog(null, "Introduceti numele de botez P" + i));


            persoane[i].setFirstName(nume.randomName());
            persoane[i].setLastName(nume.randomName());
            persoane[i].setAge(Integer.parseInt(JOptionPane.showInputDialog(null, "introduceti varsta  persoanei " + persoane[i].getFirstName() + persoane[i].lastName)));

        }
        PersonSorter sortare = new PersonSorter();
        sortare.personSorter(persoane);


    }


}
