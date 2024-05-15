package org.learning;

import java.util.Scanner;

public class ExBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String myString = "aaaaaaaaaaabbbbbbbbaaaaaaaaaaaaaaaaabbbbaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaccccccccbbbbbbbbbbbbbbbbbccccccccccccccccc";

        System.out.print("Insert char: ");
        char myChar = scanner.next().charAt(0);

        int maxLenght = 0;
        int startIndex = -1;
        int currLenght = 0;
        int currIndex = -1;

        for (int i = 0; i < myString.length(); i++) {
            if (myString.charAt(i) == myChar) {
                if (currIndex == -1) {
                    currIndex = i;
                }
                currLenght++;
            } else {
                if (currLenght > maxLenght) {
                    maxLenght = currLenght;
                    startIndex = currIndex;
                }
                currLenght = 0;
                currIndex = -1;
            }
        }

        if (currLenght > maxLenght) {
            maxLenght = currLenght;
            startIndex = currIndex;
        }

        if (maxLenght > 0) {
            System.out.println("Max lenght: " + maxLenght);
            System.out.println("Index: " + startIndex);
        } else {
            System.out.println("No sequence found for the character: " + myChar);
        }

        scanner.close();
    }
}
