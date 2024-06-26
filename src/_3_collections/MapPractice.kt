package _3_collections

fun main() {

    //Read-only map
    val readOnlyJuiceMenu = mapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("readOnlyJuiceMenu = $readOnlyJuiceMenu")

    //Mutable map with explicit type declaration
    val juiceMenu: MutableMap<String, Int> = mutableMapOf("apple" to 100, "kiwi" to 190, "orange" to 100)
    println("juiceMenu = $juiceMenu")

    println("The value of apple juice is: ${juiceMenu["apple"]}")
    println("The juiceMenu has ${readOnlyJuiceMenu.count()} key-value pairs")
    juiceMenu.put("pear", 200)
    juiceMenu["coconut"] = 150
    println("juiceMenu = $juiceMenu")

    juiceMenu.remove("apple")
    println("juiceMenu = $juiceMenu")

    println("juiceMenu.containsKey(\"kiwi\") = ${juiceMenu.containsKey("kiwi")}")

    println("juiceMenu.keys = ${juiceMenu.keys}")
    println("juiceMenu.values = ${juiceMenu.values}")

    println("orange" in juiceMenu.keys)
    println(5000 in juiceMenu.values)
}