package exec

fun main(){
    var opcao: Int = 0

    while(opcao != -1){
        val line = readLine() ?: "0"
        opcao = line.toIntOrNull() ?: 0
        println("Você escolher a opção ${opcao}")
    }
    println("Até a próxima")
}