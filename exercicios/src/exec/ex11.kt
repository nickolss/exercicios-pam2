package exec

fun main() {
    val nota = 9
    when (nota) {
        9 , 10 -> {
            //Número entre 9 e 10
            println("Fantástico")
        }
        7 , 8 -> {
            println("Parabéns")
        }
        4 ,5, 6 -> {
            println("Tem como recuperar")
        }
        in 0 .. 3 -> {
            println("Te vejo no próximo ano")
        }
        else -> {
            println("Nota inválida")
        }
    }
}
