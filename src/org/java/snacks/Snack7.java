// Scrivere un programma che dati dei secondi li converta in ore, minuti, secondi e mostri
// a video la stringa generata (secondi → “hh:mm:ss”)

package org.java.snacks;

import java.util.Scanner;

public class Snack7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inserisci i secondi da convertire");
        int seconds = Integer.parseInt(scanner.nextLine());
        int minutes = 0;
        int hours = 0;
        if (seconds > 60) minutes = seconds / 60;
        if (minutes > 60) hours = minutes / 60;

        String secondsToPrint;
        String minutesToPrint;
        String hoursToPrint;
        int secondsToShow = 0;
        int minutesToShow = 0;
        int hoursToShow = 0;

        if (seconds > 59) {
            secondsToShow = seconds % 60;
            secondsToPrint = String.valueOf(secondsToShow);
        }
        else secondsToPrint = String.valueOf(seconds);

        if (minutes > 59) {
            minutesToShow = minutes % 60;
            minutesToPrint = String.valueOf(minutesToShow);
        }
        else minutesToPrint = String.valueOf(minutes);

        if (hours > 24) {
            hoursToShow = hours % 60;
            hoursToPrint = String.valueOf(hoursToShow);
        }
        else hoursToPrint = String.valueOf(hours);


        if (secondsToShow < 10) {
            secondsToPrint = "0" + secondsToPrint;
        }
        if (minutesToShow < 10) {
            minutesToPrint = "0" + minutesToPrint;
        }
        if (hoursToShow < 10) {
            hoursToPrint = "0" + hoursToPrint;
        }

        System.out.println(hoursToPrint + ":" + minutesToPrint + ":" + secondsToPrint);
    }
}
