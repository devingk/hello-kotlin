package _7_null_safety

fun describeString(maybeString: String?): String {

    if (maybeString != null && maybeString.length > 0) {
        return "String of length ${maybeString.length}"
    } else {
        return "Empty or null string"
    }
}

fun lengthString(maybeString: String?): Int? = maybeString?.length

fun main() {
    val nullString: String? = null
    println(describeString(nullString))

    println(lengthString(nullString))

    val nullString2: String? = null
    println(nullString2?.uppercase())
}