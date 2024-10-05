package ru.sug4chy.messages

import ru.sug4chy.model.enums.DifficultyLevel

fun greeting(): String =
    """
        Welcome to the Number Guessing Game!
        I'm thinking of a number between 1 and 100.
        You have limited count of  chances to guess the correct number.

        Please select the difficulty level:
        1. Easy (10 chances)
        2. Medium (5 chances)
        3. Hard (3 chances)

        Enter your choice: 
    """.trimIndent()

fun startGame(selectedDifficultyLevel: DifficultyLevel): String =
    """
        Great! You have selected the $selectedDifficultyLevel difficulty level.
        Let's start the game!
    """.trimIndent()

fun enterYourGuess(): String =
    """
        Enter your guess: 
    """.trimIndent()

fun congratulations(attemptsCount: Int): String =
    """
        Congratulations! You guessed the correct number in $attemptsCount attempts.
    """.trimIndent()