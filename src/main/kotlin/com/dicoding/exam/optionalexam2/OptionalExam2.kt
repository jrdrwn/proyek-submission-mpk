package com.dicoding.exam.optionalexam2

// TODO
fun minAndMax(number: Int): Int {
    val arrrayInt = number.toString().toCharArray().map { it.digitToInt() }
    return arrrayInt.min() + arrrayInt.max()
}
