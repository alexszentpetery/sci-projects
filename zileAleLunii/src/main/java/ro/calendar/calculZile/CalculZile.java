package ro.calendar.calculZile;

import javax.swing.JOptionPane;

/**
 * Clasa care calculeaza numarul de zile dintr-o luna
 */


public class CalculZile {
    int numar;
    public String operatie;

    /**
     * functie care preia o luna si calculeaza numaruld e zile din luna respectiva
     *
     * @param luna
     * @return numar
     */


    public int numarZile(String luna) {

        luna = luna.toLowerCase();

        operatie = luna;

        switch (luna) {
            case "ianuarie":
            case "martie":
            case "mai":
            case "iulie":
            case "august":
            case "octombrie":
            case "decembrie":
                numar = 31;
                break;
            case "aprilie":
            case "iunie":
            case "septembrie":
            case "noiembrie":
                numar = 30;
                break;

            case "februarie":
                // ---------------- PERICOL DE JAVA NULL POINTER exception
                String an = JOptionPane.showInputDialog(null, "introduceti anul;");
                Double anSelectat = Double.parseDouble(an);

                // se imparte la 4 - an bisect
                //  se imparte la 100 - nu e an bisect
                // se imparte la 400 -an bisect

                if (anSelectat % 4 == 0 && (anSelectat % 100 != 0 || anSelectat % 400 == 0)) {
                    numar = 29;
                } else
                    numar = 28;
                break;
            default:
                // ---------------- PERICOL DE JAVA NULL POINTER exception

                JOptionPane.showMessageDialog(null, "luna introdusa nu exista", "Error", JOptionPane.ERROR_MESSAGE);

                // ---------------- PERICOL DE JAVA NULL POINTER exception
                Object[] possibilities = {"ianuarie", "februarie", "martie", "aprilie", "mai", "iunie", "iulie", "august", "septembrie", "octombrie", "noiembrie", "decembrie"};
                operatie = (String) JOptionPane.showInputDialog(
                        null,
                        "Selectati o luna?",
                        "Selector Operatiune",
                        JOptionPane.WARNING_MESSAGE,
                        null,
                        possibilities,
                        "ianuarie");
                numarZile(operatie);
                break;

        }


        return numar;
    }

    /**
     * metoda pentru afisarea numarului de zile din luna selectata
     * se corecteaza daca luna citita initial era incorecta
     *
     * @param luna
     */
    public void printeazaCalculZile(String luna) {
        if (numar == 0) {
            numarZile(luna);
        }
        System.out.println("numar de zile in luna " + operatie + "  este: " + numar);
        numar = 0;
    }

}
