package ro.sci.functions;

import ro.sci.functions.math.Calculator;

public class Main {

    public static void main(String[]args){

        System.out.println("salutare");

        Calculator calculator = new Calculator();

            System.out.println("suma:" + calculator.aduna(3,4));

        System.out.println("fibonacii:" + calculator.fibonacci(9) );




    }
}