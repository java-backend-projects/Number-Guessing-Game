# Number guessing game (https://roadmap.sh/projects/number-guessing-game)

This is a simple CLI (command-line-interface) game, where you need to guess the number that computer selected.

## Installation

1. **Clone the repository:**
    ```bash
   git clone https://github.com/java-backend-projects/Number-Guessing-Game
   cd Number-Guessing-Game
    ```
2. **Unzip archive with .jar and executable script:**
    ```bash
   unzip number-guessing-game.zip
    ```
   
## Usage

```bash
./number-guessing-game

Welcome to the Number Guessing Game!
I'm thinking of a number between 1 and 100.
You have 5 chances to guess the correct number.

Please select the difficulty level:
1. Easy (10 chances)
2. Medium (5 chances)
3. Hard (3 chances)

Enter your choice: 
2

Great! You have selected the Medium difficulty level.
Let's start the game!

Enter your guess:
50
Incorrect! The number is less than 50.

Enter your guess:
25
Incorrect! The number is greater than 25.

Enter your guess:
35
Incorrect! The number is less than 35.

Enter your guess:
30
Congratulations! You guessed the correct number in 4 attempts.
```