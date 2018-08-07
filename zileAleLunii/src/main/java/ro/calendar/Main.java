package ro.calendar;

import ro.calendar.calculZile.CalculZile;

import javax.swing.JOptionPane;

public class Main {

    public static void main(String[] args) {

        CalculZile calculZile = new CalculZile();

        String luna = JOptionPane.showInputDialog(null, "introduceti luna pentru care se doreste calculul de zile");

        System.out.println("numar de zile in luna " + luna + "  este: " + calculZile.CalculeazaNumarZile(luna));

    }
}