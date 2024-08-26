fun count_words(text: String) : Int {
    val words = text.split(" ").toTypedArray()
    return words.size
}

fun main(){
	println(count_words("O gato roeu a roupa do rei de Roma"))
}
