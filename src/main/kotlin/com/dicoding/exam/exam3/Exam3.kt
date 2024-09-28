package com.dicoding.exam.exam3

fun <T> checkType(args: T): String {
    return "Yes! it's ${
        when (args) {
            is Integer -> "Integer"
            is String -> "String"
            is Boolean -> "Boolean"
            is Double -> "Double"
            is List<*> -> "List"
            is Map<*, *> -> "Map"
            else -> null
        }
    }"
}
