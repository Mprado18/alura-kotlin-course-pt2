package collections

fun testaAssociate() {
    val pedidos = listOf(
        Pedido(1, 20.0),
        Pedido(2, 60.0),
        Pedido(3, 30.0),
        Pedido(4, 70.0)
    )
    println(pedidos)
    val pedidosMapeados = pedidos.associateBy { pedido -> pedido.numero }
    println(pedidosMapeados)
    println(pedidosMapeados[2])

    val pedidosFreteGratis = pedidos.associateWith { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosFreteGratis)

    val pedidoFretesGratisAgrupados = pedidos.groupBy { pedido ->
        pedido.valor < 50
    }
    println(pedidoFretesGratisAgrupados)
    println(pedidoFretesGratisAgrupados[false])

    val nomes = listOf(
        "Marcos",
        "Angie",
        "Maria",
        "Michele",
        "Erlete",
        "Winky",
        "Edite",
        "Eduardo"
    )

    val agenda = nomes.groupBy { nome ->
        nome.first()
    }
    println(agenda)
    println(agenda['E'])

    val pedidosAgrupados: Grouping<Pedido, Boolean> = pedidos.groupingBy { pedido ->
        pedido.valor > 50.0
    }
    println(pedidosAgrupados.eachCount())
}

data class Pedido(val numero: Int, val valor: Double)