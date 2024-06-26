package _4_control_flow

fun main() {

    var cakesEaten = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    cakesEaten = 0
    var cakesBaked = 0
    while (cakesEaten < 3) {
        println("Eat a cake")
        cakesEaten++
    }

    do {
        println("Bake a cake")
        cakesBaked++
    } while(cakesBaked < cakesEaten)
}