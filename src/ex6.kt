import javax.print.attribute.standard.DialogTypeSelection
import kotlin.random.Random

const val dias = 30

fun main() {
    val temps = Array<Int>(dias) { 0 }
    val random = Random(System.currentTimeMillis())

    for (i in 0 until dias) {
        temps[i] = random.nextInt(-10, 30)
    }

    val media = temps.sum() / temps.size
    val min = temps.min()
    val max = temps.max()

    println("Temperatura média: ${media}ºC")
    println("Temperatura mínima: ${min}ºC (dia ${temps.indexOf(min)+1})")
    println("Temperatura máxima: ${max}ºC (dia ${temps.indexOf(max)+1})")
}