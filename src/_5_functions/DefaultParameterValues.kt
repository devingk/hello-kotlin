package _5_functions

fun printMessageWithPrefix2(message: String, prefix: String = "Info") {
    println("[$prefix] $message")
}
fun main() {
    printMessageWithPrefix2("Hello", "Log")

    printMessageWithPrefix2("Hello")
}