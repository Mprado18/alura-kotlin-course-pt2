fun testaRanges() {
    val serie: IntRange = 1.rangeTo(10)
    for (s in serie) {
        print("$s")
    }

    println()

    val numerosPares = 2..100 step 2
    for (numeroPar in numerosPares) {
        print("$numeroPar ")
    }

    println()

    val numerosParesReversos = 100 downTo 2 step 2
    numerosParesReversos.forEach { print("$it ") }

    println()

    val salarios = 1500.0..3500.0
    val salario = 2884.56
    if (salario in salarios) {
        println("Está dentro do intervalo de salários")
    } else {
        println("Não está dentro do intervalo de salários")
    }
}