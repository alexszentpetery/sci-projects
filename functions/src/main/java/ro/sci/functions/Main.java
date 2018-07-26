package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        System.out.println("suma:" + calculator.adunare(3, 4));

        System.out.println("scadere:" + calculator.scadere (3, 4));

        System.out.println("impartire:" + calculator.impartire (10, 2));

        System.out.println("inmultire:" + calculator.inmultire(3, 4));



    }
}