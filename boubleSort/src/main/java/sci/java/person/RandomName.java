package sci.java.person;

import java.util.Random;

/**
 * Clasa pentru a genera un sir de charactere de o anumita lungime (predefinita sau random) dintr-un sir care contine litere alfabetului
 * returneaza o variabila de tip string
 */

public class RandomName {

    public String randomName() {

        String caractere;
        caractere = "abcdefghijklmnopqrstuvwxyz";

        String caractere2;
        caractere2 = "ABCDEFGHIJKLMMOPQRSTUVWXYZ";

        String randomString;
        randomString = "";

        int numarCaractere;
        Random rand = new Random();

        //lungime random sau predefinita
        numarCaractere = 4;
        // numarCaractere = rand.nextInt(7);

        //se genereaza sirul de charactere
        char[] text = new char[numarCaractere];

        for (int i = 0; i < numarCaractere; i++) {
            //primul caractere se citeste din sirul uppercase
            if (i == 0) {
                text[i] = caractere2.charAt(rand.nextInt(caractere2.length()));
            } else {
                text[i] = caractere.charAt(rand.nextInt(caractere.length()));
            }
        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        randomString = randomString + " ";
        return randomString;
    }
}



