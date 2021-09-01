package list

fun main() {

   listaDeLivrosComNull.imprimeComMarcadores()

   listaDeLivrosComNull
      .filterNotNull()
      .groupBy { it.editora ?: "Editora desconhecida" }
      .forEach { (editora, livros) ->
         println("$editora: ${livros.joinToString { it.titulo }}")
      }

}

