package Oswego;

import java.util.Random;
import java.util.Scanner;

public class ProbabilityGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome to the Probability Game!");
        System.out.print("Enter a number between 1 and 10: ");
        int userNumber = scanner.nextInt();

        int randomNumber = random.nextInt(10) + 1;
        System.out.println("The random number is: " + randomNumber);

        if (userNumber == randomNumber) {
            System.out.println("Congratulations! You win!");
        } else {
            double probability = 1.0 / 10.0;
            System.out.println("Sorry, you lose. The probability of winning was " + probability);
        }
    }

}

