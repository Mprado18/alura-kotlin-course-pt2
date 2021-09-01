package list

fun main() {

    println("\nIMPRESSÕES TESTANDO COLLECTIONS COM LIST\n")

    listaDeLivros.imprimeComMarcadores()

    val ordenarPorAno: List<Livro> = listaDeLivros.sorted()
    ordenarPorAno.imprimeComMarcadores()

    val ordenarPorTitulo = listaDeLivros.sortedBy { it.titulo }
    ordenarPorTitulo.imprimeComMarcadores()

    val ordenarPorAutor = listaDeLivros.sortedBy { it.autor }
    ordenarPorAutor.imprimeComMarcadores()

    listaDeLivros
        .filter { it.autor == "José de Alencar" }
        .imprimeComMarcadores()

    val prateleira = Prateleira(genero = "Literatura", livros = listaDeLivros)
    val porAutor = prateleira.organizaPorAutor()
    val porAno = prateleira.organizaPorAno()

    porAutor.imprimeComMarcadores()
    porAno.imprimeComMarcadores()

}

