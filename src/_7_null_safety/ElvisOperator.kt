package _7_null_safety

fun main() {
    val nullString: String? = null
    println(nullString?.length ?: 0)
}