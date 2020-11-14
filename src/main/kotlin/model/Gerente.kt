package model

import model.interfaces.Orador

class Gerente(override val nome: String,
              override val matricula: Int,
              override val salario: Double,
              val oratoria: String) : Funcionario(nome, matricula, salario), Orador {
    override fun nivelOratoria(): String {
        return oratoria
    }

};
