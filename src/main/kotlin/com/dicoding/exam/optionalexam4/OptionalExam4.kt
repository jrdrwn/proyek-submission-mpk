package com.dicoding.exam.optionalexam4

// TODO
fun getMiddleCharacters(string: String): String {
    val strlen = string.length
    return if (strlen % 2 == 0) {
        val mid = strlen / 2
        string.slice(mid - 1..mid)
    } else {
        string[strlen / 2].toString()
    }
}
