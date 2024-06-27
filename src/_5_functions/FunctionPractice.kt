package _5_functions

fun main() {
//    hello()
//    println(sum(1, 2))
    printMessage("Hello")
}

fun hello() {
    return println("Hello, world!")
}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun printMessage(message: String) {
    println(message)
}

