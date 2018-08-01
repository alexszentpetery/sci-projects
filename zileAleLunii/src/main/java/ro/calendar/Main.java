package ro.calendar;

import ro.calendar.calculZile.CalculZile;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        CalculZile calculZile = new CalculZile();

        String luna = JOptionPane.showInputDialog(null, "introduceti luna pentru care se doreste calculul de zile");


        //introdus metoda de printare in cazul in care se citeste o luna inexistenta

        calculZile.printeazaCalculZile(luna);
        //calculZile.printeazaCalculZile("februarie");
    }


}
