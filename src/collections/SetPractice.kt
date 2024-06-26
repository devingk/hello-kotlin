package collections

fun main() {
    // Read-only set
    val readOnlyFruits = setOf("apple", "banana", "cherry", "cherry")
//    readOnlyFruits.add("pear") //compile error
    println("readOnlyFruits = $readOnlyFruits")

    val fruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    fruits.add("pear")
    fruits.remove("apple")
    println("fruits = $fruits")

    val mutableFruits: MutableSet<String> = mutableSetOf("apple", "banana", "cherry")
    mutableFruits.add("pear")
    println("mutableFruits = $mutableFruits")
    val lockedFruits: Set<String> = mutableFruits
    println("lockedFruits = $lockedFruits")
//    val againMutableFruits: MutableSet<String> = lockedFruits   //Type mismatch

    println("The fruits has ${readOnlyFruits.count()} items")
    println("banana" in fruits)
}