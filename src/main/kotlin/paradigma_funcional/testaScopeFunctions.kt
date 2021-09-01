package paradigma_funcional

fun testaScopeFunctionsEHOF() {
    testaLet()
}

fun testaLet() {
    Endereco(logradouro = "Rua azul", 123)
        .also { println("Criando endereço") }
        .let { endereco ->
            "Endereço: ${endereco.logradouro}, ${endereco.numero}".toUpperCase()
        }.let(::println)

    listOf(
        Endereco(complemento = "casa"),
        Endereco(complemento = "apartamento"),
        Endereco()
    ).filter { endereco ->
        endereco.complemento.isNotEmpty()
    }.let(::println)

    soma(1, 5) {
        println(it)
    }
}

fun soma(a: Int, b: Int, resultado: (Int) -> Unit) {
    println("Antes da soma")
    resultado(a + b)
    println("Depois da soma")
}

data class Endereco(
    var logradouro: String = "",
    var numero: Int = 0,
    var complemento: String = ""
) {
    fun enderecoCompleto(): String {
        return """
            $logradouro - $numero - $complemento
        """.trimIndent()
    }
}