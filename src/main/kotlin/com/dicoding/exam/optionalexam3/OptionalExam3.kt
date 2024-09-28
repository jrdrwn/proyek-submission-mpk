package com.dicoding.exam.optionalexam3

// TODO
fun manipulateString(str: String, int: Int): String {
    var digit = str.filter { it.isDigit() }
    digit = (if (!digit.isEmpty()) (digit.toInt() * int) else int).toString()

    return str.filter { it.isLetter() } + digit
}
