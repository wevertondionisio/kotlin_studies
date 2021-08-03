package Collections

fun main() {
    val joao = Funcionario("João", 1000.0)
    val pedro = Funcionario("Pedro", 3000.0)
    val maria = Funcionario("Maria", 5000.0)

    val funcionario = listOf(joao, pedro, maria)

    funcionario.forEach { println(it) }

    println("-----------------------------")
    println(funcionario.find { it.nome == "Maria" })
}

data class Funcionario(
    val nome:    String,
    val salario: Double
) {
    override fun toString(): String =
        """
            Nome: $nome 
            Salário: $salario   
        """.trimIndent()
}