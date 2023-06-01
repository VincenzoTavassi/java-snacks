// Snack9
// Calcola la somma e la media dei primi 10 numeri.

package org.java.snacks;

public class Snack9 {
    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 10; i++) sum += i;
        double media = (double) sum / 10;

        System.out.println("La somma è " + sum + " mentre la media è " + media);
    }
}
