import javax.print.attribute.standard.DialogTypeSelection
import javax.swing.text.StyledEditorKit.BoldAction
import kotlin.random.Random
class Produto(val nome: String, var quantidade: Int, val nivelMinimo: Int,
    val nivelMaximo: Int) {

    fun reporEstoque() {
        quantidade = nivelMaximo
    }
}

fun main() {
    val produtos: MutableList<Produto> = mutableListOf()

    for (i in 0..4) {
        print("Digite o nome do produto: ")
        val nome = readln()

        print("Digite as quantidades atual, mínima e máxima do produto (separados por espaço): ")
        val (quantidade, qtdMinima, qtdMaxima) = readln().split(" ").map({it.toInt()})

        val produto = Produto(nome, quantidade, qtdMinima, qtdMaxima)

        if (quantidade < qtdMinima) {
            println("Quantidade abaixo do nível mínimo. Repondo estoque...")
            produto.reporEstoque()
        }

        produtos.add(produto)
    }
}