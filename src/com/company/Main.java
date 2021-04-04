package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {




        Random random = new Random();
        int numberToGuess = random.nextInt(10) + 1;
        int tries = 0;

        Scanner input = new Scanner(System.in);
        int guess;
        boolean win = false;


        while (win == false) {
            System.out.println("Guess a number between 1 and 10");
            guess = input.nextInt();
            tries++;

            if (guess == numberToGuess)
                win = true;
            else if (guess < numberToGuess)
                System.out.println("TOO LOW");
            else if (guess > numberToGuess)
                System.out.println("TOO HIGH");
        }

        System.out.println("WINNER!!!!!!!");
        System.out.println("The number was " + numberToGuess);
        System.out.println("Number of tries: " + tries);











    }


}
