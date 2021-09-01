package paradigma_funcional

fun testaFuncoes() {

    testaTipoFuncaoReferencia()
    testaTipoFuncaoClasse()
    testaTipoFuncaoLamba()
    testaTipoFuncaoAnonima()
    testaReturnComLabel()

}

fun testaReturnComLabel() {
    val calculaBonificacao: (salario: Double) -> Double = lambda@{ salario ->
        if (salario > 1000.0) {
            return@lambda salario + 50
        }
        return@lambda salario + 100.0
    }
    println(calculaBonificacao(1100.0))
}

fun testaTipoFuncaoAnonima() {
    val minhaFuncaoAnonima: () -> Unit = fun() {
        println("executa com função anonima")
    }
    println(minhaFuncaoAnonima())
}

fun testaTipoFuncaoLamba() {
    val minhaFuncaoLambda: (Int, Int) -> Int = { a, b ->
        a + b
    }
    println("executa com lambda: ${minhaFuncaoLambda(15,10)}")
}

fun testaTipoFuncaoClasse() {
    val minhaFuncaoClasse: () -> Unit = Teste()
    println(minhaFuncaoClasse())
}

fun testaTipoFuncaoReferencia() {
    val minhaFuncao: () -> Unit = ::teste
    println(minhaFuncao())
}

fun teste() {
    println("executa teste")
}

class Teste: () -> Unit {
    override fun invoke() {
        println("executa invoke do Teste")
    }
}