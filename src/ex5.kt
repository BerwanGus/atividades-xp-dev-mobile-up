import kotlin.random.Random

fun main() {
    val random = Random(System.currentTimeMillis())

    println("Quantas jogadas realizar?")
    val jogadas = readln().toInt()

    for (i in 0 until jogadas) {
        val dado1 = random.nextInt(1, 7)
        val dado2 = random.nextInt(1, 7)
        println("Lançamento ${i+1}: ${dado1} + ${dado2} = ${dado1 + dado2}")
    }
}