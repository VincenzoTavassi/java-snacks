// Snack3
//Crea un array di numeri interi e fai la somma di tutti gli elementi che sono in posizione dispari

package org.java.snacks;

public class Snack3 {
    public static void main(String[] args) {
        int[] numbers = { 0, 4, 5, 6, 8, 9, 10, 12, 14, 13};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 != 0) sum += numbers[i];
        }
        System.out.println("La somma degli elementi in posizione dispari è " + sum);
    }
}
