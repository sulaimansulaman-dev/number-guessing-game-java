// Enum for Difficulty Levels
enum DifficultyLevel {
    EASY(10),
    MEDIUM(50),
    HARD(100);

    private final int maxNumber;

    DifficultyLevel(int maxNumber) {
        this.maxNumber = maxNumber;
    }

    public int getMaxNumber() {
        return maxNumber;
    }
}
