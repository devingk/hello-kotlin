package _4_control_flow

fun main() {

    val obj = "Hello"

    when (obj) {
        "1" -> println("One")

        "Hello" -> println("Greeting")

        else -> println("Unknown")
    }

    val result = when (obj) {
        "1" -> "One"

        "Hello" -> "Greeting"

        else -> "Unknown"
    }
    println(result)

    val temp = 10

    val description = when {
        temp < 0 -> "very cold"

        temp < 10 -> "a bit cold"

        temp < 20 -> "warm"

        else -> "hot"
    }
    println(description)
}