package sci.java.person;

import java.util.Random;

public class RandomName {

    public String randomName() {

        String caractere;
        caractere = "abcdefghijklmnopqrstuvwxyz";

        String randomString;
        randomString = "";

        int numarCaractere;
        Random rand = new Random();

        numarCaractere=4;

        //nu folosesc random la numarul de caractere ca sa putem citi mai bine valorile sortate
        //numarCaractere = rand.nextInt(7);

        char[] text = new char[numarCaractere];

        for (int i = 0; i < numarCaractere; i++) {
            text[i] = caractere.charAt(rand.nextInt(caractere.length()));

        }

        for (int i = 0; i < text.length; i++) {
            randomString += text[i];
        }
        randomString = randomString + " ";
        return randomString;
    }


}
