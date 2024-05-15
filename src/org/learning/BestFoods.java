package org.learning;

public class BestFoods {

    public static void main(String[] args) {

        String[] foods = {"Pizza", "Cioccolato", "Bistecca", "Gelato", "Pasta" };

        System.out.println("Total foods: " + foods.length);
        System.out.println("First food: " + foods[0]);
        System.out.println("Last food: " + foods[foods.length - 1]);
        System.out.println("Medium food: " + foods[foods.length / 2]);
    }

}
