package com.ajfortuna.variaveis

class NullSafety {
}

fun main() {
//    //zerar uma variável tem q colocar o operador ?
//    var inteiro : Int? = null
//    //para fazer uma operação precisa usar o operador elvis ?: (então) igual a zero
//    var inteiro2 = 5
//    var resultado = (inteiro ?: 0) + inteiro2
//
//    println(resultado)

    //ou com a variavel imutavel

    val inteiro : Int? = null
    var inteiro2 = 5
    var resultado = 0

    if(inteiro != null) {
        resultado = inteiro + inteiro2
    }


}