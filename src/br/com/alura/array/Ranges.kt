package br.com.alura.array

fun main() {
    val serie: IntRange = 1.rangeTo(10)
    for(s in serie){
        print("$s ")
    }
    println()
    val numerosPares = 0..100 step 2 // 2.unti2(100) step 2
    for(numeroPar in numerosPares){
        print("$numeroPar ")
    }
    println()
    println("DownTo")
    val numerosParesReverso =100 downTo 0 step 2
    numerosParesReverso.forEach{ print("$it ")}
    println()
    println("Between numbers")

    val intervalo = 1500.0..5000.0
    val salario = 5001.0
    if(salario in intervalo){
        println("Salário está no intervalo")
    }else
        println("Salário não está no intervalo")
    println()
    println("Between char")
    val alfabeto = 'a'..'z'
    val letra = 'k'
    println(letra in alfabeto)
}