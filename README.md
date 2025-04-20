# Guess the Number - Java Game

A simple and fun console-based **number guessing game** built in **Java**, demonstrating **object-oriented programming (OOP)** principles like **inheritance**, **enums**, and use of **common Java structures** like `ArrayList`, `Scanner`, and `Random`.

## 🕹️ How to Play

1. Enter your name.
2. Choose a difficulty:
   - Easy (1–100)
   - Medium (1–500)
   - Hard (1–1000)
3. Try to guess the number!
4. The game gives you feedback like:
   - **Too high!**
   - **Too low!**
   - 🎉 **Correct!**

## 💡 Features

- Object-Oriented Design with super & subclass structure
- Difficulty settings via enums
- Stores and shows your previous guesses
- Clear feedback and console formatting using ANSI escape codes

## 📂 Project Structure

- `Main.java` – Runs the game
- `Game.java` – Abstract superclass
- `NumberGuessingGame.java` – Main game logic
- `Player.java` – Handles player data
- `DifficultyLevel.java` – Enum for difficulty options

## 🚀 Getting Started

1. Clone the repo:
   ```bash
   git clone https://github.com/your-username/guess-the-number-java.git
2. Compile all .java files:
   ```bash
   javac *.java
3. Run the Game:
   ```bash
   java Main
   
