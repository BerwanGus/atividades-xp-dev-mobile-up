fun main() {
    val nomes: MutableList<String> = mutableListOf()

    for (i in 0..9) {
        print("Digite o nome do aluno ${i+1}: ")
        nomes.add(readln())
    }
    nomes.sort()
    println(nomes)
}