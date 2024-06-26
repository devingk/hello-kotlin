package _4_control_flow

fun main() {
    for (number in 1..5) {
        print(number)
    }
    println()

    val cakes = listOf("carrot", "cheese", "chocolate")

    for (cake in cakes) {
        println("Yummy, it's a $cake cake!")
    }
}