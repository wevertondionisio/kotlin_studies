package Collections

fun main () {
    val nomes = Array(3) {""}
    nomes[0] = "Ariel"
    nomes[1] = "Alex"
    nomes[2] = "José"

    for (nome in nomes) {
        println(nome)
    }

    nomes.forEach {
        println(it)
    }
}
