package model

import model.interfaces.Palestrante

class Lider(override val nome: String,
                         override val matricula: Int = 0,
                         override val salario: Double,
                         val topicos: List<String>) : Funcionario(nome, matricula, salario), Palestrante {
    override fun nomeTopicos(): List<String> {
        return topicos
    }
};