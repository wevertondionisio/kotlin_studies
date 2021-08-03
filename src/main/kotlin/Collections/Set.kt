package Collections

fun main () {
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 3000.0)
    val maria = Funcionario("Maria", 5000.0)

    val funcionario1 = setOf(joao, maria)
    val funcionario2 = setOf(maria)

    val resultado = funcionario1.union(funcionario2)
    resultado.forEach {
        println(it)
    }
}