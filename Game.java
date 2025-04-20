import java.util.List;
import java.util.ArrayList;

// Superclass Game
abstract class Game {
    private int attempts;
    private List<Integer> previousGuesses;
    protected Player player;

    public Game(Player player) {
        this.player = player;
        this.attempts = 0;
        this.previousGuesses = new ArrayList<>();
    }

    // Abstract method to be implemented by subclasses
    public abstract void startGame();

    public void incrementAttempts() {
        attempts++;
    }

    public void displayAttempts() {
        System.out.println("Attempts: " + attempts);
    }

    public void addGuess(int guess) {
        previousGuesses.add(guess);
    }

    public void displayPreviousGuesses() {
        System.out.println("Previous guesses: " + previousGuesses);
    }
}
