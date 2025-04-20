import java.util.Scanner;
import java.util.Random;

// Subclass for the Number Guessing Game
class NumberGuessingGame extends Game {
    private int numberToGuess;
    private DifficultyLevel difficulty;
    private Scanner scanner;

    public NumberGuessingGame(Player player, DifficultyLevel difficulty) {
        super(player);
        this.difficulty = difficulty;
        this.scanner = new Scanner(System.in);
        Random random = new Random();
        this.numberToGuess = random.nextInt(difficulty.getMaxNumber()) + 1;
    }

    @Override
    public void startGame() {

        System.out.println("Welcome, " + player.getName() + "!");
        System.out.println("I'm thinking of a number between 1 and " + difficulty.getMaxNumber() + ". Can you guess it?");
        
        boolean guessedCorrectly = false;
        while (!guessedCorrectly) {



            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            addGuess(userGuess); // Store the guess
            incrementAttempts(); // Increment attempts

            displayPreviousGuesses(); // Display previous guesses
            displayAttempts(); // Display the number of attempts

            if (userGuess < numberToGuess) {
                System.out.println("\033[1;32mToo low! Try again.\033[0m");
            } else if (userGuess > numberToGuess) {
                System.out.println("\033[1;31mToo high! Try again.\033[0m");
            } else {
                System.out.println("\033[1;33mCorrect! You guessed the number!\033[0m");
                guessedCorrectly = true;
            }


        }
    }
}
