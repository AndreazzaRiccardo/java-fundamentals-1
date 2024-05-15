package org.learning;

import java.util.Scanner;

public class GuestList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] guests = {"Jennifer Lopez", "Zendaya", "Chris Hemsworth", "Bad Bunny", "Cara Delevingne", "Kendall Jenner", "Uma Thurman", "Damiano David", "Luca Guadagnino"};

        System.out.print("What's your name ? ");
        String guestName = scanner.nextLine();

        for (String guest : guests) {
            if (guest.equals(guestName)) {
                System.out.println("You are welcome");
                return;
            }
        }
        System.out.println("Sorry, you are not on the list");
        scanner.close();
    }

}
