
fun main() {

    // Read only list
    val readOnlyShapes = listOf("triangle", "square", "circle")
//    readOnlyShapes.add("rectangle") //compile error
    println("readOnlyShapes = $readOnlyShapes")

    // Mutable list with explicit type declaration
    val shapes: MutableList<String> = mutableListOf("triangle", "square", "circle")
    shapes.add("rectangle")
    shapes.remove("triangle")
    println("shapes = $shapes")

    println("The first item in the list is: ${readOnlyShapes[0]}")
    println("The first item in the list is: ${readOnlyShapes.first()}")
    println("readonlyShapes has ${readOnlyShapes.count()} items")
    println("circle" in readOnlyShapes)
}
