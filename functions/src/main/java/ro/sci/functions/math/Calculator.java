package ro.sci.functions.math;

/**
 * Clasa folosita pentru calcule. un simplu calculator.
 */
public class Calculator {
    /**
     * Functie care aduna doua numere de tip double
     *
     * @param a
     * @param b
     * @return suma
     */
    public static Double adunare(double a, double b) {
        return a + b;

    }

    /**
     * Functie care face diferenta intre doua numere de tip double,
     *
     * @param a
     * @param b
     * @return diferenta
     */
    public static Double scadere(double a, double b) {
        return a - b;
    }

    /**
     * Functie care inmulteste doua numere de tip double
     *
     * @param a
     * @param b
     * @return inmultirea
     */
    public static Double inmultire(double a, double b) {
        return a * b;
    }

    /**
     * Functie care imparte doua numere de tip double
     *
     * @param a
     * @param b
     * @return impartirea
     */

    public static Double impartire(double a, double b) {


        if (b != 0) {
            return a / b;
        } else
            System.out.println("ERROR ---- Impartirea la 0 nu este permisa ----");
        return null;
        //people recomand to throw an exception
    }
}