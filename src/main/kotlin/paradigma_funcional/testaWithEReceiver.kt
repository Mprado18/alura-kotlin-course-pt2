package paradigma_funcional

fun testaWithEReceiver() {
    testaWith()
    testaReceiver()
}

fun testaReceiver() {
    somaReceiver(1, 5, resultado = {
        println(this)
    })
}

fun somaReceiver(a: Int, b: Int, resultado: Int.() -> Unit) {
    println("antes da soma")
    val total = a + b
    total.resultado()
    println("depois da soma")
}

fun testaWith() {
    with(Endereco()) {
        logradouro = "Rua teste"
        numero = 145
        complemento = "casa"

        completo()
    }.let { enderecoCompleto ->
        println(enderecoCompleto)
    }
}