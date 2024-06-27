package _5_functions

fun printMessageWithPrefix(message: String, prefix: String) {
    println("[$prefix] $message")
}

fun main() {
    printMessageWithPrefix(prefix = "Log", message = "Hello")
}