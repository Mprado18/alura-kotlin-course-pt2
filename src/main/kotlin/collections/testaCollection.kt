package collections

fun testaCopia() {
    val banco = BancoDeNomes()
    val copiaNomesSalvos: Collection<String> = banco.nomes
//    banco.nomes.add("Marcos")
    banco.salva("Marcos")
    println(BancoDeNomes().nomes)
    println(copiaNomesSalvos)
}

class BancoDeNomes {
    val nomes: Collection<String> get() = dados.toList()

    fun salva(nome: String) {
        dados.add(nome)
    }

    companion object {
        private val dados = mutableListOf<String>()
    }
}

fun testaColecao() {
    val nomes: Collection<String> = mutableListOf(
        "Marcos",
        "Erlete",
        "Angie",
        "Winky"
    )
    for (nome in nomes) {
        println(nome)
    }
    println(nomes)
    println("Tem o nome Winky? ${nomes.contains("Winky")}")
}