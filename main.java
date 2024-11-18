package kp;
import java. util. Scanner;
import java.util. Random;
public class task1 {
	public static void main (String [ ] args) {
		Scanner scanner = new Scanner (System.in) ;
		Random random = new Random () ;
		boolean playAgain = true;
		int totalScore = 0;
		int maxAttempts = 5;
		
		System. out.println ("Welcome to the Number Guessing Game!") ;
		
		while (playAgain) {
			int numberToGuess = random. nextInt (100) + 1;
			int attempts = 0;
			boolean guessedCorrectly = false;
			System. out.println ("\nI'm thinking of a number between 1 and 100.") ;
			System. out. println ("You have " + maxAttempts + " attempts to guess the number. ") ;
			
			while (attempts < maxAttempts && !guessedCorrectly) {
				System. out.print ("Enter your guess: ") ;
				int userGuess = scanner.nextInt ();
				attempts++;
				if (userGuess == numberToGuess) {
				System. out. println ("Congratulations! You guessed the correct number. ") ;
				guessedCorrectly = true;
				}
				else if (userGuess > numberToGuess) {
				System.out.println ("Too high! Try again.") ;
				}else {
					System. out.println ("Too low! Try again.") ;
				}
			}
			if (!guessedCorrectly) {
				System. out.println ("Sorry! You've used all your attempts. The correct number was: " + numberToGuess) ;
				
			}
			int score = maxAttempts - attempts + 1;
			totalScore += guessedCorrectly ? score : 0;
			System. out. println ("Your score this round: " + (guessedCorrectly ? score : 0)) ;
			System.out.println ("Total score: " + totalScore) ;
			System. out.print ("Do you want to play another round? (yes/no): ") ;
			String response = scanner.next ();
			playAgain = response.equalsIgnoreCase ("yes") ;
		}
		System. out.println ("Thanks for playing! Your final score is: " + totalScore) ;
		scanner.close ();
		
	}
}
