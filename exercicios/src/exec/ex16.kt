package exec

fun main(){
    val alunos = arrayListOf("André" , "Carla" , "Marco")
    for ((indice, aluno) in alunos.withIndex()){
        println("${indice} - ${aluno} \n")
    }
}