/*
Snack2
Generatore di “nomi cognomi” casuali: il Grande Gatsby ha una lista di nomi e una lista di cognomi,
e da queste vuole mostrare a video una falsa lista di invitati con nome e cognome.
 */

package org.java.snacks;

import java.util.Arrays;
import java.util.Random;

public class Snack2 {
    public static void main(String[] args) {

        String[] names = { "Paolo", "Antonio", "Filippo", "Gerardo", "Carlo", "Laura", "Samantha"};
        String[] surnames = { "Rossi", "Bianchi", "Di Caprio", "Di Matteo", "Di Nuovo", "Di Non So"};

        Random random = new Random();

        String[] invitati = new String[surnames.length];

        for (int i = 0; i < surnames.length; i++) {
            int randomNameNumber = random.nextInt(names.length);
            int randomSurnameNumber = random.nextInt(surnames.length);
            invitati[i] = names[randomNameNumber] + ' ' + surnames[randomSurnameNumber];
        }
        System.out.println(Arrays.toString(invitati));
    }
}
