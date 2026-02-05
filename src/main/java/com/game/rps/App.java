package com.game.rps;

import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(10) + 1;
        int guess;

        System.out.println("🎮 Guess The Number Game");
        System.out.println("Enter a number between 1 to 10:");

        guess = sc.nextInt();

        if (guess == number) {
            System.out.println("🎉 Correct! You win!");
        } else {
            System.out.println("❌ Wrong! Number was: " + number);
        }

        sc.close();
    }
}
