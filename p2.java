import java.util.Scanner;
import java.util.Random;

public class p2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int lowerBound = 1;
        int upperBound = 100;
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;
        boolean hasGuessedCorrectly = false;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I've chosen a number between " + lowerBound + " and " + upperBound + ". Try to guess it!");
        
        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int guess = scanner.nextInt();
            attempts++;
            
            if (guess < randomNumber) {
                System.out.println("Your guess is too low. Try again.");
            } else if (guess > randomNumber) {
                System.out.println("Your guess is too high. Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You've guessed the number " + randomNumber + " in " + attempts + " attempts.");
            }
        }
        
        scanner.close();
    }
}
