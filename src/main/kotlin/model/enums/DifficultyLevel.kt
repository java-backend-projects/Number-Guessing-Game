package ru.sug4chy.model.enums

import ru.sug4chy.extensions.capitalizeFirstChar

enum class DifficultyLevel(val maxAttemptsCount: Int) {
    EASY(10),
    MEDIUM(5),
    HARD(3);

    override fun toString(): String =
        this.name.lowercase().capitalizeFirstChar()

    companion object {
        fun fromUserInput(input: String): DifficultyLevel {
            val inputAsInt = requireNotNull(input.toIntOrNull()) { "Invalid input. Please, enter a number." }

            return when(inputAsInt) {
                1 -> EASY
                2 -> MEDIUM
                3 -> HARD
                else -> throw IllegalArgumentException("Invalid input. Please, enter number between 1 and 3.")
            }
        }
    }
}
