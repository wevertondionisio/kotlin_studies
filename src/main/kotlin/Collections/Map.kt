package Collections

fun main () {
    val pair : Pair<String, Double> = Pair ("João", 1000.0)
    val maps = mapOf(pair)

    maps.forEach { (k, v) -> println("Chave: $k - Valor: $v" )}

    val maps2 = mapOf("Pedro" to 2500.0, "Maria" to 3000.0)

    maps2.forEach{ (k, v) -> println("Chave: $k - Valor: $v" )}


}