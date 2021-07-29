package Collections

fun  main() {
    val value = IntArray(5)
    value[0] = 1
    value[1] = 2
    value[2] = 3
    value[3] = 4
    value[4] = 5

    for (valor in value) {
        println(valor)
    }

    value.forEach { valor ->
        println(valor)
    }

    for (index in value.indices) {
        println(value[index])
    }

}