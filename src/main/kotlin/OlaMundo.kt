import model.Desenvolvedor
import model.Gerente
import model.Lider
import kotlin.reflect.typeOf

fun main() {
    val romoaldo: Gerente = Gerente(matricula = 680923, salario = 12000.00, nome = "Romoaldo Batista", oratoria = "Excelente")
    val cristiane = Lider("Cristiane Rodrigues", 658201, 8500.00, mutableListOf("Java", "PMBOK", "Scrum") )
    val fabricio = Desenvolvedor("Fabricio Silva", 854638, 9800.00, "Spring Boot")

    println();

    var funcionarios = listOf(romoaldo, cristiane, fabricio)

    for(funcionario in funcionarios) {
        funcionario.apresentaPessoa()
        println(funcionario::class.simpleName)
        (funcionario as? Gerente)?.apresentaOratoria()
        (funcionario as? Lider)?.apresentaTopicos()
        (funcionario as? Desenvolvedor)?.apresentaTecnologia()
        println(" ")
    }

    when {
        funcionarios.size == 0 -> {
            println("Ainda não é empresa");
        }
        funcionarios.size == 1 -> {
            println("Pode ser MEI.")
        }
        funcionarios.size < 10 -> {
            println("Deve ser Microempresa")
        }
        else -> {
            println("Deve ser uma empresa comum");
        }
    }
}