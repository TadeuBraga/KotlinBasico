package model

import java.time.LocalDateTime

open class Funcionario(open val nome: String, open val matricula: Int = 0, open val salario: Double) {
    init {
        val agora = LocalDateTime.now()
        println("Novo funcionário inicializado.  $agora.")
    }

    fun apresentaPessoa() {
        println("Funcionário: $nome, Matricula $matricula, salario $salario.")
    }
}