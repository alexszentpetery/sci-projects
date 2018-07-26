package ro.sci.functions;

import javax.swing.*;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        // folosec parametri din intellij si dau valori numerelor
        JOptionPane.showMessageDialog(null, "Operatiuni Disponibile : adunare , scadere , impartire , inmultire");

        //citim operatiunea care se doreste a se interpreta
        String operatie = JOptionPane.showInputDialog(null, "Ce operatiune doriti sa facem ?");

        Calculator calculator = new Calculator();
        switch (operatie) {

        case "adunare":
            System.out.println("suma:" + calculator.adunare(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
            break;
        case "scadere":
            System.out.println("scadere:" + calculator.scadere(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
            break;
        case "impartire":
        if (Double.parseDouble(args[1]) != 0) {

            System.out.println("impartire:" + calculator.impartire(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
        } else

            System.out.println("ERROR ---- Impartirea la 0 nu este permisa ----");
            break;
        case "inmultire":
            System.out.println("inmultire:" + calculator.inmultire(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
            break;
        default:
            JOptionPane.showMessageDialog(null,"Operatiune incorecta");
            break;
    }
}
}