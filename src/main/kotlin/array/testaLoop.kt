fun testaLoop() {
    val idades = intArrayOf(45, 44, 12, 14, 65, 25)

    var maiorIdade = 0
    for (idade in idades) {
        if (idade > maiorIdade) {
            maiorIdade = idade
        }
    }

    println(maiorIdade)

    var menorIdade = Int.MAX_VALUE
    idades.forEach { idade ->
        if (idade < menorIdade) {
            menorIdade = idade
        }
    }

    println(menorIdade)

    val salarios = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    val aumento = 1.1
    for ((indice, salario) in salarios.withIndex()) {
        salarios[indice] = salario * aumento
    }

    println(salarios.contentToString())

    val salarios2 = doubleArrayOf(1500.0, 2300.0, 5000.0, 8000.0, 10000.0)

    salarios2.forEachIndexed { index, salario ->
        salarios2[index] = salario * aumento
    }

    println(salarios2.contentToString())
}