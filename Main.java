import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Ask the player for their name
            System.out.print("Enter your name: ");
            String playerName = scanner.nextLine();
            Player player = new Player(playerName);

            // Ask for the difficulty level
            System.out.println("Choose difficulty: 1. Easy 2. Medium 3. Hard");
            int difficultyChoice = scanner.nextInt();
            DifficultyLevel difficulty = DifficultyLevel.EASY;

            switch (difficultyChoice) {
                case 1: difficulty = DifficultyLevel.EASY; break;
                case 2: difficulty = DifficultyLevel.MEDIUM; break;
                case 3: difficulty = DifficultyLevel.HARD; break;
                default: System.out.println("Invalid choice, defaulting to Easy."); break;
            }

            // Create and start the Number Guessing Game
            Game game = new NumberGuessingGame(player, difficulty);
            game.startGame();

        } finally {
            scanner.close(); // Safe to close here
        }
    }
}
