package ru.sug4chy.utils

import ru.sug4chy.model.enums.DifficultyLevel
import kotlin.random.Random

object NumberGuessingGame {
    private val guessedNumber = Random.Default.nextInt(from = 1, until = 100)

    var attemptsCount: Int = 0
    lateinit var selectedDifficulty: DifficultyLevel

    fun checkAttemptedNumber(attemptedNumber: Int) {
        check(++attemptsCount <= selectedDifficulty.maxAttemptsCount) {
            "You ran out of attempts. Guessed number is $guessedNumber"
        }
        require(attemptedNumber == guessedNumber) {
            if (attemptedNumber < guessedNumber) {
                "Incorrect! The number is greater than $attemptedNumber"
            } else {
                "Incorrect! The number is less than $attemptedNumber"
            }
        }
    }
}