package model.interfaces

interface Orador {
    fun nivelOratoria(): String;
    fun apresentaOratoria() {
        println("Tem ${nivelOratoria()} oratória.")
    };
}