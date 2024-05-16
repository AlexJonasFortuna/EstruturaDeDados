package com.ajfortuna.variaveis

class Conditionals {
}

fun main() {

//    var numero = 2
//
//    if(numero < 4){
//        println("O numero $numero é menor que 4")
//    }else if(numero == 4) {
//        println("O numero $numero é igual 4")
//    }else{
//        println("O numero $numero é maior que 4")
//    }

//      when{
//          numero < 4 -> println("O numero $numero é menor que 4")
//          numero == 4 -> println("O numero $numero é igual 4")
//          else -> println("O numero $numero é maior que 4")
//      }

//    var parImpar: String
//    var numero = 3
//
//    parImpar = if(numero % 2 == 0) "par" else "impar"
//    println(parImpar)

    var numero1 = 22
    var numero2 = 10
    var numero3 = 20

//    when{
//        numero1 > numero2 && numero1 > numero3 -> println("O numero $numero1 é o maior de todos")
//        numero1 > numero2 -> println("O numero $numero1 é o maior de que o numero2 e menor que o numero3")
//        numero1 > numero3 -> println("O numero $numero1 é o maior de que o numero3")
//        else -> println("O numero $numero1 é o menor de todos")
//    }

    //ou
    val resultado = when{
        numero1 > numero2 && numero1 > numero3 -> "O numero $numero1 é o maior de todos"
        numero1 > numero2 -> "O numero $numero1 é o maior de que o numero2 e menor que o numero3"
        //a sentença abaixo acredito que nunca será satisfeita, pois a primeira já satisfaz:
        numero1 > numero3 -> "O numero $numero1 é o maior de que o numero3"
        else -> "O numero $numero1 é o menor de todos"
    }

    println(resultado)

}

