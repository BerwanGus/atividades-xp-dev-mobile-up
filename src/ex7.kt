import javax.print.attribute.standard.DialogTypeSelection
import javax.swing.text.StyledEditorKit.BoldAction
import kotlin.random.Random
class Voo(val numeroVoo: Int, val assentosDisponiveis: MutableList<Int>) {

    fun reservarAssento(assento: Int): Boolean {
        if (assento in assentosDisponiveis) {
            assentosDisponiveis.remove(assento)
            println("Assento $assento disponível. Reservando assento...")
            return true
        }
        else {
            println("Assento $assento indisponível.")
            return false
        }
    }
}

fun main() {
    val voo = Voo(10, mutableListOf(1, 4, 6, 7))
    voo.reservarAssento(3)
    voo.reservarAssento(4)
    voo.reservarAssento(4)
}