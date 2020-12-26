package br.com.alura.array

fun main() {
    val idades: IntArray = intArrayOf(20,33,14,16,33,60)
    val maxOrNull = idades.maxOrNull()
    println(maxOrNull)

    val menorIdade = idades.minOrNull()
    println(menorIdade)

    val media = idades.average()
    println("Média: $media")

    val todosMaiores: Boolean = idades.all { it > 18 }
    println("Todos maiores? $todosMaiores")

    val existemaior: Boolean = idades.any { it >= 18 }
    println("Algum aluno é maior de idade? $existemaior")

    val maiores: List<Int> = idades.filter { it >= 18 }
    println("Maiores: $maiores")

    val busca: Int? = idades.find { it >=18 }
    println("Busca: $busca")


}