package org.learning;

import java.util.Scanner;

public class CalcTicket {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("How old are you ? ");
        int userAge = Integer.parseInt(scanner.nextLine());
        System.out.print("How many kilometers do you have to travel? ");
        int kilometres = Integer.parseInt(scanner.nextLine());

        double totalPrice = kilometres * 0.21;

        double finalPrice;

        if(userAge < 18) {
            finalPrice = totalPrice - ( totalPrice * 20 / 100);
        } else if ( userAge > 65) {
            finalPrice = totalPrice - ( totalPrice * 40 / 100 );
        } else {
            finalPrice = totalPrice;
        }

        System.out.println("Your final price is: " + finalPrice + " €");

        scanner.close();
    }

}
