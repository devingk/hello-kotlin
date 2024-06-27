package _5_functions

fun uppercaseString(text: String): String {
    return text.uppercase()
}

fun main() {
    println(uppercaseString("hello"))

    println({ text: String -> text.uppercase() }("hello"))

    val upperCaseString = { text: String -> text.uppercase() }
    println(upperCaseString("hello"))

    val numbers = listOf(1, -2, 3, -4, 5, -6)
    val positives = numbers.filter { x -> x > 0 }
    val negatives = numbers.filter { x -> x < 0 }
    println(positives)
    println(negatives)

    val doubled = numbers.map { x -> x * 2 }
    val tripled = numbers.map { x -> x * 3 }
    println(doubled)
    println(tripled)

    val upperCaseStringFunctionType: (String) -> String = { text -> text.uppercase() }
    println(upperCaseStringFunctionType("hello"))

    val timesInMinutes = listOf(2, 10, 15, 1);
    val min2sec = toSeconds("minute")
    val totalTimeSeconds = timesInMinutes.map(min2sec).sum()
    println("Total time is $totalTimeSeconds secs")

    println({ text: String -> text.uppercase() }("hello"))

    println(listOf(1, 2, 3).fold(0, { x, item -> x + item }))
    println(listOf(1, 2, 3).fold(0) {x, item -> x + item})
}

fun toSeconds(time: String): (Int) -> Int = when (time) {
    "hour" -> { value -> value * 60 * 60 }
    "minute" -> { value -> value * 60 }
    "second" -> { value -> value }
    else -> { value -> value }
}