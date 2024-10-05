package ru.sug4chy.extensions

fun String.capitalizeFirstChar(): String =
    this.replaceFirstChar { it.uppercaseChar() }