import java.math.BigDecimal
import java.math.RoundingMode

fun testaCollections() {

    val idades: IntArray = intArrayOf(10, 12, 18, 33, 40, 67)

    println("Idades: ${idades.contentToString()}")

    println("Maior idade: ${idades.maxOrNull()}")

    println("Menor idade: ${idades.minOrNull()}")

    val mediaIdades: Double = idades.average()
    println("Média das idades: $mediaIdades")

    val todosMaiores: Boolean = idades.all { it >= 18 }
    println("Todos são maiores de idade? $todosMaiores")

    val existeMenor: Boolean = idades.any { it < 18 }
    println("Existe algum menor de idade? $existeMenor")

    val maiores: List<Int> = idades.filter { it >= 18 }
    println("Maiores de idade: $maiores")

    val menores: IntArray = idades.filter { it < 18 }.toIntArray()
    println("Menores de idade: ${menores.contentToString()}")

    val contemDez: Boolean = idades.contains(10)
    println("Existe alguem com 10 anos? $contemDez")

    val idade: Int? = idades.find { it == 10 }
    println("Idade encontrada: $idade")

    val salarios = bigDecimalArrayOf("1500.55", "2000.00", "2250.50", "4857.58", "11254.89")

    println("Salários: ${salarios.contentToString()}")

    val aumento = "1.1".toBigDecimal()
    val salariosComAumento: Array<BigDecimal> = salarios
        .map { salario -> calculaAumentoRelativo(salario, aumento) }
        .toTypedArray()

    println("Salarios com Aumento: ${salariosComAumento.contentToString()}")

    val gastoInicial = salariosComAumento.somatoria()
    println("Gasto Inicial acumulado todos salários que tiveram aumento: $gastoInicial")

    val meses = 6.toBigDecimal()
    val gastoTotal = salariosComAumento
        .fold(gastoInicial) { acumulador, salario ->
            acumulador + (salario * meses).setScale(2, RoundingMode.UP)
        }
    println("Gasto total acumulado com todos salários próximos 6 meses: $gastoTotal")

    val salariosOrdenados = salariosComAumento
        .sorted()
        .takeLast(3)
        .toTypedArray()
    val mediaMaioresSalarios = salariosOrdenados.media()
    println("Média dos três maiores salários: $mediaMaioresSalarios")

    val menoresSalarios = salariosComAumento
        .sorted()
        .take(3)
        .toTypedArray()
    val mediaMenoresSalarios = menoresSalarios.media()
    println("Média dos três menores salários: $mediaMenoresSalarios")


}

private fun calculaAumentoRelativo(salario: BigDecimal, aumento: BigDecimal) =
    if (salario < "5000".toBigDecimal()) {
        salario + "500".toBigDecimal()
    } else {
        (salario * aumento).setScale(2, RoundingMode.UP)
    }

