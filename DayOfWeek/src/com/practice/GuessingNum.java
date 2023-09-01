package com.practice;

import java.util.Scanner;

public class GuessingNum {

    public static void main(String[] args) {
        int num = 50;
        System.out.println("Guess the number between 1 and 100.");
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your guess:");
        int userGuess = scan.nextInt();

        if (userGuess == num) {
            System.out.println("You guessed the right number!");
        } else if (userGuess < num) {
            System.out.println("You are close to the guessed number, but it's higher.");
        } else {
            System.out.println("You are close to the guessed number, but it's lower.");
        }
    }
}