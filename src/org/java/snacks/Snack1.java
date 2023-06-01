package org.java.snacks;

// Snack1
//Inserisci un numero, se è pari stampa il numero, se è dispari stampa il numero successivo.

import java.util.Scanner;

public class Snack1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int userNumber = Integer.parseInt(scanner.nextLine());
        if (userNumber % 2 == 0) System.out.println(userNumber);
        else System.out.println(userNumber + 1);
        scanner.close();
    }
}
