package Collections

fun main() {
    val salarios = DoubleArray(3)

    salarios[0] = 1000.0
    salarios[1] = 3000.0
    salarios[2] = 500.0

    salarios.forEach {
        println(it)
    }

    salarios.forEachIndexed { index, salario ->
        salarios[index] = salario * 2
    }

    salarios.forEach { println(it) }

    val salariosDois = doubleArrayOf(1500.0, 1250.0, 5000.0)
    salariosDois.sort()
    salariosDois.forEach { println(it) }
}