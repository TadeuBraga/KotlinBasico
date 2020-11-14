package model

import model.interfaces.Tecnologia

class Desenvolvedor(override val nome: String,
                    override val matricula: Int = 0,
                    override val salario: Double,
                    val tecnologia: String) : Funcionario(nome, matricula, salario), Tecnologia {
    override fun nomeTecnologia() : String {
       return tecnologia
    }
};