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
       String operatie;
       operatie=luna;

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
                JOptionPane.showMessageDialog(null,"luna introdusa nu exista");

                Object[] possibilities = {"ianuarie", "februarie", "martie", "aprilie" , "mai" , "iunie" , "iulie","august","septembrie","octombrie","noiembrie","decembrie"};
                operatie = (String) JOptionPane.showInputDialog(
                        null,
                        "Selectati o luna?",
                        "Selector Operatiune",
                        JOptionPane.PLAIN_MESSAGE,
                        null,
                        possibilities,
                        "ianuarie");
                numarZile(operatie);
                break;

        }
        luna = operatie;

        return numar;
    }

}
