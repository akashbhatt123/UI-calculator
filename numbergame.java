import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberToGuess = new Random().nextInt(100) + 1;
        int tries = 0, guess = 0;

        System.out.println("Guess a number between 1 and 100!");

        while (guess != numberToGuess) {
            System.out.print("Your guess: ");
            guess = scanner.nextInt();
            tries++;

            if (guess < numberToGuess) {
                System.out.println("Higher!");
            } else if (guess > numberToGuess) {
                System.out.println("Lower!");
            }
        }
        System.out.println("Correct! It took you " + tries + " tries.");
    }
}
