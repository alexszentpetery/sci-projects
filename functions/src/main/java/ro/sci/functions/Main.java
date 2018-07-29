package ro.sci.functions;

import javax.swing.*;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        // folosec parametri din intellij si dau valori numerelor
        JOptionPane.showMessageDialog(null, "Operatiuni Disponibile : adunare , scadere , impartire , inmultire");

        //citim operatiunea care se doreste a se interpreta
        String operatie = JOptionPane.showInputDialog(null, "Ce operatiune doriti sa facem ?");


        // Citim variabila 1
        String primaVariabila = JOptionPane.showInputDialog(null, "Introduceti prima valoare?");
        boolean test=false;
       while(test==false) {
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

        test=false;
        while (test==false) {
            try {
                Double testTry = Double.parseDouble(aDouaVariabila);
                test=true;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Valoarea introdusa nu e corecta");
                aDouaVariabila = JOptionPane.showInputDialog(null, "Introduceti a doua valoare?");
            }
        }
            Double y = Double.parseDouble(aDouaVariabila);

        Calculator calculator = new Calculator();

        // folosim swith pentru a chema doar methoda solicitata
        switch (operatie) {

            case "adunare":
                System.out.println("suma: " + calculator.adunare(x, y));
                break;
            case "scadere":
                System.out.println("scadere: " + calculator.scadere(x, y));
                break;
            case "impartire":
                System.out.println("impartire: " + calculator.impartire(x, y));
                break;
            case "inmultire":
                System.out.println("impartire: " + calculator.inmultire(x, y));
                break;

            default:
                JOptionPane.showMessageDialog(null, "Operatiune incorecta");
                break;
        }
    }
}