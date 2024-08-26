fun is_prime(n: Int) : Boolean {
    for (i in 2..n-1) {
        if (n % i == 0){
    		return false            
        }
    }
    return true
}

fun main(){
    println(is_prime(7))
}
