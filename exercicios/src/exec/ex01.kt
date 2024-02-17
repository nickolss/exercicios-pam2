package exec

fun main(){
    //Tipos primitivos inteiros do Kotlin
    val num1: Byte = 127
    val num2: Short = 32767
    val num3: Int = 2_147_483_647
    val num4: Long = 9_223_372_036_854_775_807

    //Tipos numéricos reais
    val num5: Float = 3.14F
    val num6: Double = 3.14

    //Tipo caracter[
    val char: Char = 'a' //São caracters únicos

    //Tipo boolean
    val bool: Boolean = true

    println(listOf(num1,num2,num3,num4,num5,num6,char, bool))

}