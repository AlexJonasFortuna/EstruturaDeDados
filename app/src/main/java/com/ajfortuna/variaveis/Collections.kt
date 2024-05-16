package com.ajfortuna.variaveis

class Collections {
}

fun main() {

    //********** ARRAYS **********
    var array: Array<Int> = Array(5) {0}
    var array2: IntArray = IntArray(5)

    //array[2] = 2          salva o valor no index 2
    //array.set(3,4)        salva o valor 4 no index 3
    //println(array[0])     imprime o valor no index 0
    //println(array.get(1)) imprime o valor no index 1

    //********** LISTS **********

    //abaixo uma lista mutável:
    var mutableList: MutableList<Int> = mutableListOf()
    //abaixo uma lista imutável:
    var list: List<Int> = listOf(1)

    //mutableList.add(1)    adiciona o valor ao final da lista
    //mutableList.add(0,4)  adiciona 4 ao index 0
    //mutableList.sort()    ordena a lista
    //mutableList.remove(0) remove o elemento no index 0
    //mutableList.set(0,5)  salva o valor 5 no index 0
    //mutableList[0] = 5    salva o valor 5 na posição 0
    //mutableList.get(1)    carrega o valor do index 1
    //mutableList[1]        carrega o valor do index 1

    //********** MAPS **********

    //abaixo um mapa mutável:
    var mutableMap: MutableMap<String,String> = mutableMapOf()
    //abaixo um mapa imutável:
    var map: Map<Int,String> = mapOf(Pair(1,"teste"))

    //mutableMap.put("chave1","valor1")     adiciona a chave1 no map
    //mutableMap["chave1"] = "valor2"       salva o valor2 na chave1
    //mutableMap.set("chave1","valor3")     salva o valor3 na chave1
    //mutableMap["chave1"]                  carrega o valor da chave1
    //mutableMap.get("chave1")              carrega o valor da chave1
    //mutableMap.contains("chave1")         verifica se exista a chave1
    //mutableMap.containsValue("valor1")    verifica se existe o valor1
    //mutableMap.keys                       retorna uma lista com todas as keys
    //mutableMap.values                     retorna uma lista com todos os values

    //exemplos:

    var array3: Array<String> = Array(10) {""}
    var array4: DoubleArray = DoubleArray(2) {i -> 1.0 * i}

    array4[0] = 5.0
    array4.set(1,15.0)

    println(array4[0])
    println(array4.get(1))


}