package ro.sci.functions;

import javax.swing.JOptionPane;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        //citim operatiunea care se doreste a se interpreta

        Object[] possibilities = {"adunare", "scadere", "inmultire", "impartire"};
        String operatie = (String) JOptionPane.showInputDialog(
                null,
                "Ce operatiune doriti sa facem ?",
                "Selector Operatiune",
                JOptionPane.PLAIN_MESSAGE,
                null,
                possibilities,
                "adunare");


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

            case "adunare":
                System.out.println("suma:  " + x + " + " + y + " = " + calculator.adunare(x, y));
                break;
            case "scadere":
                System.out.println("scadere:  " + x + " - " + y + " = " + calculator.scadere(x, y));
                break;
            case "impartire":
                System.out.println("impartire:  " + x + " / " + y + " = " + calculator.impartire(x, y));
                break;
            case "inmultire":
                System.out.println("inmultire : " + x + " * " + y + " = " + calculator.inmultire(x, y));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operatiune incorecta");
                break;
        }
    }
}