package exec

inline fun <T> executarConlog(nomeFuncao: String, funcao: () -> T): T{
    println("Entrando no método ${nomeFuncao}")
    try {
        return funcao()
    } finally {
        println("Método ${nomeFuncao} finalizado")
    }
}

fun somar(a: Int, b: Int): Int{
    return a + b
}

fun main(){
    val result = executarConlog("somar"){
        somar(4, 5)
    }
    println(result)
}