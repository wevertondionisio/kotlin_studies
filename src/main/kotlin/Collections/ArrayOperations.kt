package Collections

fun main () {
    val salarios = doubleArrayOf(2000.0, 2250.0, 6000.0)

//    println("maior salário: ${salarios.maxOrNull()}")
//    println("menor salário: ${salarios.minOrNull()}")
//    println("média salário: ${salarios.average()}")
//

//    for (salario in salarios) {
//        println(salario)
//    }

    val retorno = salarios.filter{ it > 2500.0 }
    retorno.forEach { (println(it)) }

    println(salarios.count{ it in 2000.0.. 6000.0})

    println(salarios.find{ it == 6000.0})
    println(salarios.find{ it == 0.0})

    println(salarios.any{ it == 1000.0})


}