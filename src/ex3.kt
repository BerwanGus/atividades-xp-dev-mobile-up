
class Aluno() {
    var nome: String = ""
    var notas: Array<Int> = emptyArray()

    init {
        println("Digite um nome:")
        nome = readLine() ?: ""
        println("Digite as notas dividas por espaços")
        notas = (readLine() ?: "").split(" ").map { it.toInt() }.toTypedArray()
    }
    
    fun media(): Double {
        val media = notas?.let {
            if (it.isNotEmpty()) {
                it.sum().toDouble() / it.size
            } else {
                0.0
            }
        } ?: 0.0
        return media
    }
}

fun main(){
 	val aluno1 = Aluno()
    println("Aluno: ${aluno1.nome}, Media ${aluno1.media()}")
}

