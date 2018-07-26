package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        // folosec parametri din intellij si dau valori numerelor

        Calculator calculator = new Calculator();

        System.out.println("suma:" + calculator.adunare(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

        System.out.println("scadere:" + calculator.scadere(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

        if(Double.parseDouble(args[1])!=0){

            System.out.println("impartire:" + calculator.impartire(Double.parseDouble(args[0]), Double.parseDouble(args[1])));
                    }
            else

            System.out.println("ERROR ---- Impartirea la 0 nu este permisa ----");

        System.out.println("inmultire:" + calculator.inmultire(Double.parseDouble(args[0]), Double.parseDouble(args[1])));

    }
}