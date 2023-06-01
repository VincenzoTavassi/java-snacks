package org.java.snacks;

import java.util.Scanner;

public class Snack4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Scrivi una parola");
        String userWord = scanner.nextLine();
        scanner.close();

        boolean palindroma = true;
        for (int i = 0; i < userWord.length() / 2; i++) {
            if (userWord.charAt(i) != userWord.charAt(userWord.length() - i - 1)) palindroma = false;
            break;
        }

        if(!palindroma) System.out.println("Non è palindroma");
        else System.out.println("E' palindroma");

    }





}
