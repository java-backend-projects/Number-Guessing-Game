package ru.sug4chy

import ru.sug4chy.messages.*
import ru.sug4chy.model.enums.DifficultyLevel
import ru.sug4chy.utils.NumberGuessingGame

fun main() {
    println(greeting())
    NumberGuessingGame.selectedDifficulty = DifficultyLevel.fromUserInput(readLine() ?: "")

    println(startGame(NumberGuessingGame.selectedDifficulty))

    while (true) {
        try {
            println(enterYourGuess())
            val inputAsInt = readln().toInt()

            NumberGuessingGame.checkAttemptedNumber(inputAsInt)

            println(congratulations(NumberGuessingGame.attemptsCount))
            return
        } catch (e: IllegalArgumentException) {
            println(e.message)
        } catch (e: IllegalStateException) {
            println(e.message)
            return
        }
    }
}