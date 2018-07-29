package ro.calendar.calculZile;

import javax.swing.*;

/**
 * Clasa care calculeaza numarul de zile dintr-o luna
 */


public class CalculZile {
    int numar;

    /**
     * functie care preia o luna si calculeaza numaruld e zile din luna respectiva
     *
     * @param luna
     * @return numar
     */


    public int numarZile(String luna) {

       luna = luna.toLowerCase();

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
                String an = JOptionPane.showInputDialog(null, "introduceti anul;");
                Double anSelectat = Double.parseDouble(an);

                // se imparte la 4 - an bisect
                //  se imparte la 100 - nu e an bisect
                // se imparte la 400 -an bisect

                if (anSelectat % 4 == 0 && (anSelectat %100 !=0 || anSelectat % 400==0)   ){
                    numar = 29;
            } else
                 numar = 28;
            break;
            default:
                System.out.println("luna introdusa nu exista");
                break;

        }
        return numar;
    }

}
