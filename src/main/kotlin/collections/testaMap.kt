fun testaMap() {
    val pedidos = mutableMapOf(
        Pair(1, 20.0),
        Pair(2, 34.0),
        3 to 50.0
    )
    testaMap(pedidos)
    testaGetEFilterMap(pedidos)

    println(pedidos + mapOf(9 to 90.0, 10 to 20.0))
    println(pedidos - 4)

    println(pedidos)

    pedidos.putAll(setOf(9 to 90.0, 10 to 20.0))
    println(pedidos)

}

fun testaGetEFilterMap(pedidos: MutableMap<Int, Double>) {
    //    val valorPedido = pedidos.getValue(6) //gera exception devido key não existir
//    println(valorPedido)
    println(pedidos.getOrElse(7) {
        "Não possui este valor"
    })
    println(pedidos.getOrDefault(8, -1.0))

    val pedidosFiltrados = pedidos.filter { (numero, valor) ->
        valor < 50
    }
    println(pedidosFiltrados)

    val pedidosMaiores = pedidos.filterValues { valor ->
        valor >= 50
    }
    println(pedidosMaiores)

    val pedidosPares = pedidos.filterKeys { numero ->
        numero % 2 == 0
    }
    println(pedidosPares)
}

fun testaMap(pedidos: MutableMap<Int, Double>) {
    println(pedidos)
    val pedido = pedidos[3]
    println("pedido: $pedido")
    for (p in pedidos) {
        println("Key do pedido: ${p.key} \nValor do pedido: ${p.value}")
    }
    pedidos[4] = 70.0
    println(pedidos)
    pedidos.put(1, 45.80)
    println(pedidos)
    pedidos.putIfAbsent(5, 125.56)
    println(pedidos)
    pedidos.remove(3, 45.5) //só remove se o valor for igual ao informado
    println(pedidos)
}