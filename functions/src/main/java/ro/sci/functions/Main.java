package ro.sci.functions;

import javax.swing.JOptionPane;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        //citim operatiunea care se doreste a se interpreta

        String operatie = null;

        while (operatie == null) {
            Object[] possibilities = {"aduna", "scade", "inmulteste", "imparte"};
            operatie = (String) JOptionPane.showInputDialog(null, "Ce operatiune doriti sa facem ?", "Selector Operatiune",
                    JOptionPane.PLAIN_MESSAGE, null, possibilities, "aduna");
        }


        // Citim variabila 1
        String primaVariabila = JOptionPane.showInputDialog(null, "Introduceti prima valoare?");
        boolean test = false;
        while (test == false) {
            try {
                Double testTry = Double.parseDouble(primaVariabila);
                test = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valoarea introdusa nu e corecta");
                primaVariabila = JOptionPane.showInputDialog(null, "Introduceti prima valoare?");

            }
        }
        Double x = Double.parseDouble(primaVariabila);

        // Citim variabila 2
        String aDouaVariabila = JOptionPane.showInputDialog(null, "Introduceti a doua valoare?");

        test = false;
        while (test == false) {
            try {
                Double testTry = Double.parseDouble(aDouaVariabila);
                test = true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valoarea introdusa nu e corecta");
                aDouaVariabila = JOptionPane.showInputDialog(null, "Introduceti a doua valoare?");
            }
        }
        Double y = Double.parseDouble(aDouaVariabila);

        // nu se poate face abort la program !! trebuie neaparat introduse valori , esc ar trebui sa faca break...

        Calculator calculator = new Calculator();

        // folosim swith pentru a chema doar methoda solicitata
        switch (operatie) {

            case "aduna":
                System.out.println("suma:  " + x + " + " + y + " = " + calculator.aduna(x, y));
                break;
            case "scade":
                System.out.println("scade:  " + x + " - " + y + " = " + calculator.scade(x, y));
                break;
            case "imparte":
                System.out.println("imparte:  " + x + " / " + y + " = " + calculator.imparte(x, y));
                break;
            case "inmulteste":
                System.out.println("inmulteste : " + x + " * " + y + " = " + calculator.inmulteste(x, y));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operatiune incorecta");
                break;
        }
    }
}