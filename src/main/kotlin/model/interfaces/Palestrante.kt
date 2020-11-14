package model.interfaces

interface Palestrante {
    fun nomeTopicos(): List<String>
    fun apresentaTopicos() {
        println("Dá palestras sobre os tópicos de: ${nomeTopicos().joinToString()}")
    }

}